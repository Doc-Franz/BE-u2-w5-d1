package com.epicode.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class MenuConfig {

    @Bean(name = "topping_tomato")
    @Scope("singleton")
    public Topping toppingTomato(){
        return new Topping("Tomato", 0 , 0);
    }

    @Bean(name = "topping_cheese")
    @Scope("singleton")
    public Topping toppingCheese(){
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "topping_salami")
    @Scope("singleton")
    public Topping toppingSalami(){
        return new Topping("Salami", 122, 1.53);
    }

    @Bean(name = "pizza_margherita")
    @Scope("singleton")
    public Pizza pizzaMargheritaBean(){
     Pizza p = new Pizza("Margherita", 1104, 6.5);
     p.addTopping(toppingCheese());
     p.addTopping(toppingTomato());
     return p;
        };

    @Bean(name = "pizza_salami")
    @Scope("singleton")
    public Pizza pizzaSalamiBean(){
        Pizza p = new Pizza("Salami", 1500, 9.2);
        p.addTopping(toppingCheese());
        p.addTopping(toppingTomato());
        p.addTopping(toppingSalami());
        return p;
    }

    @Bean(name = "water")
    @Scope("singleton")
    public Drink waterBean(){
        return new Drink("water", 60, 1.2);
    }

    @Bean(name = "lemonade")
    @Scope("singleton")
    public Drink lemonadeBean(){
        return new Drink("lemonade", 350, 2.5);
    }

    @Bean(name = "menu")
    @Scope("singleton")
    public Menu menuBean(){
        Menu menu = new Menu();
        menu.getMenuList().add(pizzaMargheritaBean());
        menu.getMenuList().add(pizzaSalamiBean());
        menu.getMenuList().add(toppingTomato());
        menu.getMenuList().add(toppingCheese());
        menu.getMenuList().add(toppingSalami());
        menu.getMenuList().add(waterBean());
        menu.getMenuList().add(lemonadeBean());
        return menu;
    }
}

package com.epicode.demo;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
    private List<Article> menuList;

    public Menu() {
        this.pizzaList = new ArrayList<Pizza>();
        this.drinkList = new ArrayList<Drink>();
        this.toppingList = new ArrayList<Topping>();

        this.menuList = new ArrayList<Article>();
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public List<Article> getMenuList() {
        return menuList;
    }


    public void printMenu(){
        System.out.println("--------Menù--------");
        this.menuList.forEach(System.out::println);
    }
}

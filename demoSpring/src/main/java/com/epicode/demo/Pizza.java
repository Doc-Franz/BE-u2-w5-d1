package com.epicode.demo;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Article{

    private List<Topping> toppingList;

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        this.toppingList = new ArrayList<Topping>();
    }

    public void addTopping(Topping t){
        this.toppingList.add(t);
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppingList=" + toppingList +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

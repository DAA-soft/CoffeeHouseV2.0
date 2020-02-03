package com.epam.krg.menu;


import com.epam.krg.coffee.CoffeeSelection;

public class Menu {
    private CoffeeSelection selection = new CoffeeSelection();

    public void createMenu() {
        System.out.println("What would you like to choose?");
        for (int i = 1; i <= CoffeeType.values().length; i++) {
            System.out.println(i + ". " + selection.selectCoffee(i));
        }
    }
}
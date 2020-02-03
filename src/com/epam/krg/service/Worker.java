package com.epam.krg.service;

import com.epam.krg.coffee.CoffeeProduction;
import com.epam.krg.coffee.CoffeeSelection;
import com.epam.krg.menu.Menu;

import java.util.Scanner;

public class Worker {
    private Client client = new Client();
    private Greeting greeting = new Greeting();
    private Menu menu = new Menu();
    private CoffeeProduction coffeeProduction = new CoffeeProduction();
    private CoffeeSelection coffeeSelection = new CoffeeSelection();

    public void greetNewClient() {
        Scanner scanner = new Scanner(System.in);
        greeting.greet(client.getName());
        menu.createMenu();
        int coffeeChoice = scanner.nextInt();
        coffeeProduction.makeCoffee(coffeeSelection.selectCoffee(coffeeChoice));
        scanner.close();
    }
}
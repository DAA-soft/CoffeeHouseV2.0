package com.epam.krg.service;

public class Greeting {
    private Client client = new Client();

    public void greet(String name){
        client.setName("Darkhan");
        System.out.println("Welcome to our CoffeeHouse, " + name + "! ");
        System.out.println("--------------------------------------------");
    }
}
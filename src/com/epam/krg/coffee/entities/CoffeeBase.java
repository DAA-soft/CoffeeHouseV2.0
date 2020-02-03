package com.epam.krg.coffee.entities;

public class CoffeeBase implements Composing,Boiling,Pouring{
    private Composing coffeeBase;

    public CoffeeBase() {
    }

    @Override
    public Composing compose() {
        boil();
        pour();
        return coffeeBase;
    }

    @Override
    public void boil() {
        System.out.println("Boiling coffee! Please, be patient!");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print("* ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boiled!");
    }

    @Override
    public void pour() {
        System.out.println("Pouring coffee!");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(350);
                System.out.print("* ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
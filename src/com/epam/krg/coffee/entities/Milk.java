package com.epam.krg.coffee.entities;

public class Milk implements Composing,Pouring {
    private Composing milk;

    public Milk(Composing milk) {
        this.milk = milk;
    }

    @Override
    public Composing compose() {
        pour();
        return milk;
    }

    @Override
    public void pour() {
        System.out.println("Pouring milk!");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
                System.out.print("* ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
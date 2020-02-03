package com.epam.krg.coffee.entities;

public class SteamedMilk implements Composing,Pouring {
    private Composing steamedMilk;

    @Override
    public Composing compose() {
        pour();
        return steamedMilk;
    }

    @Override
    public void pour() {
        System.out.println("Pouring steamed milk!");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(225);
                System.out.print("* ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
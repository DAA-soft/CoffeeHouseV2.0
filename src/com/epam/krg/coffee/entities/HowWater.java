package com.epam.krg.coffee.entities;

public class HowWater implements Composing,Pouring{
    private Composing howWater;

    @Override
    public Composing compose() {
        pour();
        return howWater;
    }

    @Override
    public void pour() {
        System.out.println("Pouring hot water!");
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
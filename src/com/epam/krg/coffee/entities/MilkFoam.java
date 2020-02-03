package com.epam.krg.coffee.entities;

public class MilkFoam implements Composing,Pouring {
    private Composing milkFoam;

    public MilkFoam() {
    }

    @Override
    public Composing compose() {
        pour();
        return milkFoam;
    }

    @Override
    public void pour() {
        System.out.println("Pouring milk foam!");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(400);
                System.out.print("* ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
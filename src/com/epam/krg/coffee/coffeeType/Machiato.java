package com.epam.krg.coffee.coffeeType;

import com.epam.krg.coffee.entities.CoffeeBase;
import com.epam.krg.coffee.entities.MilkFoam;

public class Machiato implements Coffee {
    private CoffeeBase coffeeBase = new CoffeeBase();
    private MilkFoam milkFoam = new MilkFoam();

    @Override
    public void coffeeCompose() {
        coffeeBase.compose();
        milkFoam.compose();
    }
}
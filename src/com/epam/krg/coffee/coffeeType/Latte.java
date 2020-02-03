package com.epam.krg.coffee.coffeeType;

import com.epam.krg.coffee.entities.CoffeeBase;
import com.epam.krg.coffee.entities.MilkFoam;
import com.epam.krg.coffee.entities.SteamedMilk;

public class Latte implements Coffee {
    private CoffeeBase coffeeBase = new CoffeeBase();
    private SteamedMilk steamedMilk = new SteamedMilk();
    private MilkFoam milkFoam = new MilkFoam();

    @Override
    public void coffeeCompose() {
        coffeeBase.compose();
        steamedMilk.compose();
        milkFoam.compose();
    }
}
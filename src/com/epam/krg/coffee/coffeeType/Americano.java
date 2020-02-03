package com.epam.krg.coffee.coffeeType;

import com.epam.krg.coffee.entities.CoffeeBase;
import com.epam.krg.coffee.entities.HowWater;

public class Americano implements Coffee {
    private CoffeeBase coffeeBase = new CoffeeBase();
    private HowWater howWater = new HowWater();

    @Override
    public void coffeeCompose() {
        coffeeBase.compose();
        howWater.compose();
    }
}
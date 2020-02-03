package com.epam.krg.coffee.coffeeType;

import com.epam.krg.coffee.entities.CoffeeBase;
import com.epam.krg.coffee.entities.SteamedMilk;

public class FlatWhite implements Coffee {
    private CoffeeBase coffeeBase = new CoffeeBase();
    private SteamedMilk steamedMilk = new SteamedMilk();

    @Override
    public void coffeeCompose() {
        coffeeBase.compose();
        steamedMilk.compose();
    }
}
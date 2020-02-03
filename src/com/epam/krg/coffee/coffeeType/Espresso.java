package com.epam.krg.coffee.coffeeType;

import com.epam.krg.coffee.entities.CoffeeBase;

public class Espresso implements Coffee {
    private CoffeeBase coffeeBase = new CoffeeBase();

    @Override
    public void coffeeCompose() {
        coffeeBase.compose();
    }
}
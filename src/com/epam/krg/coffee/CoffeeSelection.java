package com.epam.krg.coffee;

import com.epam.krg.menu.CoffeeType;

public class CoffeeSelection {

    public CoffeeType selectCoffee(int type){
        switch (type){
            case 1:
                return CoffeeType.AMERICANO;
            case 2:
                return  CoffeeType.CAPPUCCINO;
            case 3:
                return CoffeeType.ESPRESSO;
            case 4:
                return CoffeeType.FLAT_WHITE;
            case 5:
                return CoffeeType.LATTE;
            case 6:
                return CoffeeType.MACHIATO;
            default:
                throw new IllegalArgumentException("Wrong coffee choice:" + type);
        }
    }
}
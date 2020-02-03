package com.epam.krg.coffee;

import com.epam.krg.coffee.coffeeType.*;
import com.epam.krg.menu.CoffeeType;
import com.epam.krg.payment.Transaction;

public class CoffeeProduction {
    private Transaction transaction = new Transaction();

    public void makeCoffee(CoffeeType type){
        Coffee toReturn;
        switch (type) {
            case AMERICANO:
                toReturn = new Americano();
                toReturn.coffeeCompose();
                transaction.makePayment(1);
                break;
            case CAPPUCCINO:
                toReturn = new Cappuccino();
                toReturn.coffeeCompose();
                transaction.makePayment(2);
                break;
            case ESPRESSO:
                toReturn = new Espresso();
                toReturn.coffeeCompose();
                transaction.makePayment(3);
                break;
            case FLAT_WHITE:
                toReturn = new FlatWhite();
                toReturn.coffeeCompose();
                transaction.makePayment(4);
                break;
            case LATTE:
                toReturn = new Latte();
                toReturn.coffeeCompose();
                transaction.makePayment(5);
                break;
            case MACHIATO:
                toReturn = new Machiato();
                toReturn.coffeeCompose();
                transaction.makePayment(6);
                break;
            default:
                throw new IllegalArgumentException("Wrong coffee type:" + type);
        }
    }
}
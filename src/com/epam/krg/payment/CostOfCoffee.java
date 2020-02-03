package com.epam.krg.payment;

public class CostOfCoffee {

    protected int getPrice(int coffeeNumber){
        int price;
        switch (coffeeNumber){
            case 1:
                price = 14;
                break;
            case 2:
                price = 12;
                break;
            case 3:
                price = 10;
                break;
            case 4:
                price = 11;
                break;
            case 5:
                price = 15;
                break;
            case 6:
                price = 13;
                break;
            default:
                throw new IllegalArgumentException("Wrong coffee number: " + coffeeNumber);
        }
        return price;
    }
}

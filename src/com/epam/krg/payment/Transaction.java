package com.epam.krg.payment;

import java.util.Scanner;

public class Transaction extends PaymentCheck{
    private CostOfCoffee costOfCoffee = new CostOfCoffee();

    public void makePayment(int coffeeNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You need to pay " + costOfCoffee.getPrice(coffeeNumber));
        System.out.println("Select the payment type: 1. card , 2. cash");
        int paymentType = scanner.nextInt();
        switch (paymentType){
            case 1:
                System.out.println("Enter your pin-code: ");
                int pinCode = scanner.nextInt();
                checkCard(pinCode);
                makePaymentByCard();
                System.out.println("Your payment is successful! Enjoy your coffee");
                break;
            case 2:
                System.out.println("Enter the amount of money: ");
                int amountOfCash = scanner.nextInt();
                checkCash(amountOfCash, costOfCoffee.getPrice(coffeeNumber));
                break;
            default:
                throw new IllegalArgumentException("There's no such a payment type :" + paymentType);
        }
    }
}
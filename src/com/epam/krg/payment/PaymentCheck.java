package com.epam.krg.payment;

import java.util.Scanner;

public class PaymentCheck {
    private Scanner scanner = new Scanner(System.in);

    protected void checkCard(int pinCode){
        while (pinCode >= 0) {
            if (pinCode < 10000 && pinCode > 999) {
                break;
            } else {
                System.out.println("Enter the valid pin-code.Enter '0' to quit");
                pinCode = scanner.nextInt();
                if(pinCode == 0) {
                    break;
                } else {
                    checkCard(pinCode);
                }
            }
        }
    }

    protected void checkCash(int amountOfMoney, int costOfCoffee){
        while (costOfCoffee > 0 && amountOfMoney >= 0) {
            if (amountOfMoney < costOfCoffee) {
                System.out.println("You need to pay " + (costOfCoffee - amountOfMoney) + " more USD!");
                costOfCoffee -= amountOfMoney;
                amountOfMoney = scanner.nextInt();
            } else if (amountOfMoney > costOfCoffee) {
                costOfCoffee -= amountOfMoney;
                System.out.println("Here's your change! " + (amountOfMoney - costOfCoffee) + " USD");
                System.out.println("Enjoy your coffee!");
                break;
            } else {
                costOfCoffee -= amountOfMoney;
                System.out.println("Here's your coffee! Enjoy");
                break;
            }
        }
    }

    protected void makePaymentByCard() {
        System.out.print("Checking the payment!  ");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("* ");
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

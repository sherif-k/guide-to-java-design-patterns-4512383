package com.example;

public class VendingMachine {

    Snack getSnack(String snackType) {
        if (snackType.equalsIgnoreCase("ChocolateBar")) {
            return new ChocolateBar();
        } else if (snackType.equalsIgnoreCase("Chips")) {
            return new Chips();
        } else {
            return new Drink();
        }

    }

}

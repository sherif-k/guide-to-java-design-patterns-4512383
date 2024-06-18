package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        var atm = buildAtmChain();
        atm.dispense(request);
    }

    private static ATM buildAtmChain() {
        var UsDollarATM = new UsDollarATM(null);
        var EuroATM = new EuroATM(UsDollarATM);
        return EuroATM;
    }

}

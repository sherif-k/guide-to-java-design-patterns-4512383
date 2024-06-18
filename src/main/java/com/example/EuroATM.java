package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nextAtm) {
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.EUR)
            System.out.println("Dispensing €" + request.getAmount());
        else if (nextAtm != null) {
            nextAtm.dispense(request);
        }
    }
}

package com.example;

public class CheckoutPage {

    public void payWithCard() {
        System.out.println("Payment made with card");
    }

    public void pay(Payment payment) {
        payment.Pay();
    }

    public void payByBankTransfer() {
        System.out.println("Payment made by bank transfer");
    }

}

package com.example;

public interface Payment {
  void Pay();

  Payment payWithCard = () -> System.out.println("Payment made with card");
  Payment payByBankTransfer = () -> System.out.println("Payment made by bank transfer");
}

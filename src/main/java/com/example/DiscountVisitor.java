package com.example;

public class DiscountVisitor implements Visitor {

  private int price;

  @Override
  public void visit(AdultTicket adultTicket) {
    adultTicket.setPrice(5);
  }

  @Override
  public void visit(GroupTicket groupTicket) {
    groupTicket.getElements().forEach(e -> e.accept(this));
  }

  public int getTotalPrice() {
    return price;
  }

}

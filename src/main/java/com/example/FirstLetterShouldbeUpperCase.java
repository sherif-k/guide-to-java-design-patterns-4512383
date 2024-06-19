package com.example;

public class FirstLetterShouldbeUpperCase implements Expression {

  public String interpret(String context){
    context = context.substring(0,1).toUpperCase() + context.substring(1);
    return context;
  }
}

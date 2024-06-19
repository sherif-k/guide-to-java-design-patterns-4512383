package com.example;

public class LastLetterShouldbeDot implements Expression {
  private final FirstLetterShouldbeUpperCase firstLetterShouldbeUpperCase = new FirstLetterShouldbeUpperCase();

  public String interpret(String context) {
    if (!context.endsWith(".")) {
      context = context + ".";
    }
    return firstLetterShouldbeUpperCase.interpret(context);
  }

}

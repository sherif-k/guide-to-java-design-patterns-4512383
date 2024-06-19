package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        System.out.println(context);
        LastLetterShouldbeDot lastLetterShouldbeDot = new LastLetterShouldbeDot();
        var result = lastLetterShouldbeDot.interpret(context);
        System.out.println(result);
    }

}

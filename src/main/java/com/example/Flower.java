package com.example;

public class Flower {

    public Flower(String name) {
        System.out.println("Creating " + name + " object");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done creating " + name + " object");

    }

}

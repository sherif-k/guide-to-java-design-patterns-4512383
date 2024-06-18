package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var LightOpeartionExecutor = new LightOpeartionExecutor();
        light.isOn();
        LightOpeartionExecutor.execute(new LightOnOperation(light));
        light.isOn();
        LightOpeartionExecutor.execute(new LightOffOperation(light));
        light.isOn();

    }

}

package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var mediator = new Mediator(pedestrianCrossingLight, trafficLight);

        mediator.changeToAmber();
        mediator.changeToGreen();
        mediator.changeToAmber();
        mediator.changeToRed();

    }

}

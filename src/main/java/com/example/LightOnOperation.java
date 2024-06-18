package com.example;

public class LightOnOperation implements LightOperation {
  private final Light light;

  public LightOnOperation(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOnLight();
  }
}

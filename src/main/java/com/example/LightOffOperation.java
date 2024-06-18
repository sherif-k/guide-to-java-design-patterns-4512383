package com.example;

public class LightOffOperation implements LightOperation {
  private final Light light;

  public LightOffOperation(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOffLight();
  }
}

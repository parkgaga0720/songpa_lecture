package com.ohgiraffers.section01.init;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    public void driveMaxSpeed() {
        System.out.println(modelName+ " " + maxSpeed);
    }
}

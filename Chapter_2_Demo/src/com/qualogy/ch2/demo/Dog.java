package com.qualogy.ch2.demo;

//Dog IS-A Animal Relationship
public class Dog extends Animal implements AnimalInterface {

    private String name;

    private int distance = 8;

    private int speed = 12;

    private double jumpingHeight = 0.54;

    private boolean canJump = true;

    static int dogCount = 0;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    public double getJumpingHeight() {
        return jumpingHeight;
    }

    @Override
    public int getSpeedInKilometers() {
        return speed;
    }

    @Override
    public void setJumpingHeight(double jumpingHeight) {
        this.jumpingHeight = jumpingHeight;
    }

    @Override
    public boolean getCanJump() {
        return canJump;
    }

    @Override
    public void eat() {
        System.out.print("Eats Pedigree ");
    }

    public int getDistance() {

        return distance;
    }

    public void setSpeed(int distance) {
        this.distance = distance;
    }

    // Used for Casting
    public String bark() {
        String bark = "Woef Woef";
        return bark;
    }

    public String getName() {
        return name;
    }

    public int getDogCount() {
        return dogCount;
    }
}

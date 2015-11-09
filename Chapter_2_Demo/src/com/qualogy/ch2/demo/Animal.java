package com.qualogy.ch2.demo;

public class Animal {

    private int speed;

    private double jumpingHeight;

    private boolean canJump;

    public void getHeader() {
        System.out.println("ANIMALS!\n");
    }

    public double getJumpingHeight() {
        return jumpingHeight;
    }

    public void setJumpingHeight(double jumpingHeight) {
        this.jumpingHeight = jumpingHeight;
    }

    public int getSpeedInKilometers() {
        return speed;
    }

    public void setSpeedInKilometers(int speed) {
        this.speed = speed;
    }

    public void animalInheritance() {
        System.out.print("inherited from the Animal Class ");
    }

    public boolean getCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        canJump = getCanJump();
    }

    // Overriding super class example
    public void superOverride() {
        System.out.println("Overriding from the SUPERCLASS");
    }

    // Overloading example
    public int getCalculation(int firstDist, int secondDist) {
        return firstDist - secondDist;
    }

    // Overloading example diff arguments
    public double getCalculation(double firstDist, double secondDist) {
        return firstDist + secondDist;
    }
}

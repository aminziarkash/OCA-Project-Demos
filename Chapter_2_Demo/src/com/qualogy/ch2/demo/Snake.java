package com.qualogy.ch2.demo;

public class Snake extends Animal implements AnimalInterface {

    private boolean canJump = false;

    @Override
    public void eat() {
        System.out.print("Eats rabbits, ");
    }

    @Override
    public boolean getCanJump() {
        return canJump;
    }

    @Override
    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }
}

package com.qualogy.ch2.demo;

//Horse IS-A Animal Relationship
public class Horse extends Animal implements AnimalInterface {

    private final double jumpingHeight = 1.8;

    private final int km = 30;

    private boolean canJump = true;

    @Override
    public void setJumpingHeight(double jumpingHeight) {
        jumpingHeight = getJumpingHeight();
    }

    @Override
    public double getJumpingHeight() {
        return jumpingHeight;
    }

    //
    // Overriding example
    @Override
    public void eat() {
        System.out.print("Eats hay, ");
    }

    @Override
    public int getSpeedInKilometers() {
        return km;
    }

    @Override
    public void setSpeedInKilometers(int kilometers) {
        kilometers = getSpeedInKilometers();
    }

    public void horseInheritance() {
        System.out.println("as well as the Application Class");
    }

    @Override
    public boolean getCanJump() {
        return canJump;
    }

    @Override
    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    @Override
    public void superOverride() {
        System.out.println("\nOverriding from the HORSE class!");
        super.superOverride();
        System.out.println("and back to the HORSE class");
    }
}

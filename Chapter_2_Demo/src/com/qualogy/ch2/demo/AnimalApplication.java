package com.qualogy.ch2.demo;

public class AnimalApplication {

    private boolean canJump = false;

    private int distance;

    private Dog dog;

    public AnimalApplication() {
        Animal animal = new Animal();
        animal.getHeader();
        addSeperatorLine();

        // get dog info
        getDoginfo();
        addSeperatorLine();

        // get snake info
        getSnakeInfo();
        addSeperatorLine();

        // get horse info
        getHorseInfo();
        addSeperatorLine();

        // super override example
        superOverrideExample();
        addSeperatorLine();

        // Overloading example
        someCalculation();
    }

    public void getDoginfo() {
        dog = new Dog("Goofy");
        System.out.print("Dog\t\t:\t");
        distance = dog.getDistance(); // ENCAPSULATION
        dog.setCanJump(canJump);
        canJump = dog.getCanJump();
        String canJumpString = getCanJumpStatus();
        double dogJumpingHeight = dog.getJumpingHeight();

        dog.eat();
        System.out.println("and runs " + distance + " km's an hour.");
        System.out.println("Name\t\t:\t" + dog.getName());
        System.out.println("Can jump\t:\t" + canJumpString);
        System.out.println("Jumping height\t:\t" + dogJumpingHeight + " Meters");

        // Casting to convert Animal to Dog
        Animal[] animals = {dog, new Horse(), new Snake()};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog barkingDog = (Dog) animal;
                String barkingString = barkingDog.bark(); // can make it shorter ((Dog) animal).bark();
                System.out.println("The dog barks\t:\t" + barkingString);
            }
        }

        // Another dog for testing
        dog = new Dog("Fluffy");
        String anotherDogName = dog.getName();
        int count = dog.getDogCount(); // STATIC EXAMPLE
        System.out.println("Another one\t:\t" + anotherDogName);
        System.out.println("And total dogs\t:\t" + count);
    }

    public void getSnakeInfo() {
        Snake snake = new Snake();
        System.out.print("Snake\t\t:\t");
        snake.eat();
        canJump = snake.getCanJump();
        System.out.println("but also loves to eat mice!");
        double snakeJumpingHeight = snake.getJumpingHeight();
        String canJumpString = getCanJumpStatus();

        System.out.println("Can jump\t:\t" + canJumpString);
        System.out.println("Jumping height\t:\t" + snakeJumpingHeight + " Meters");
    }

    public void getHorseInfo() {
        Horse horse = new Horse();
        System.out.print("Horse\t\t:\t");
        horse.eat();
        canJump = horse.getCanJump();
        double horseJumpingHeight = horse.getJumpingHeight();
        distance = horse.getSpeedInKilometers();
        String jumppingStatus = getCanJumpStatus();
        System.out.print("runs " + horse.getSpeedInKilometers() + " km's per hour and is ");
        horse.animalInheritance(); // INHERITANCE
        horse.horseInheritance();

        System.out.println("Can jump\t:\t" + jumppingStatus);
        System.out.println("Jumping height\t:\t" + horseJumpingHeight + " Meters");
    }

    public void superOverrideExample() {
        // overriding a method in the superclass through HORSE class
        Horse horse = new Horse();
        horse.superOverride();
    }

    public String getCanJumpStatus() {
        String canJumpStatus;

        if (canJump) {
            canJumpStatus = "YES";
        } else {
            canJumpStatus = "NO";
        }

        return canJumpStatus;
    }

    public void someCalculation() {
        Animal animal = new Animal();
        Horse horse = new Horse();
        dog = new Dog("");

        int horseSpeed = horse.getSpeedInKilometers();
        double horseJumpingHeight = horse.getJumpingHeight();
        int dogSpeed = dog.getSpeedInKilometers();
        double dogJumpingHeight = dog.getJumpingHeight();

        // Overloading example
        int speedDiff = animal.getCalculation(horseSpeed, dogSpeed);
        double jumpingHeightTotal = animal.getCalculation(horseJumpingHeight, dogJumpingHeight);

        System.out.println("The difference between the dog's and horse's speed is : " + speedDiff + " km's");
        System.out
            .println("If you add up the jumping height, you will get : " + jumpingHeightTotal + " Meters");
    }

    public void addSeperatorLine() {
        System.out.println(
            "___________________________________________________________________________________________________________________________________");
    }

}

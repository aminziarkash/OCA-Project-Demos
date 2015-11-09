package com.qualogy.demo;

public class Employee implements Person {

    private String name;

    private int age;

    private boolean hasDriverLicense;

    public Employee(String name, int age, boolean hasDriverLicense) {
        this.name = name;
        this.age = age;
        this.hasDriverLicense = hasDriverLicense;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean hasDrivingLicense() {
        return hasDriverLicense;
    }
}

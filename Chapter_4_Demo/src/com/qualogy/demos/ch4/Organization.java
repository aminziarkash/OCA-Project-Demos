package com.qualogy.demos.ch4;

public class Organization {

    // name of the organization
    private String name;

    // number of employees in the organization
    private int numOfEmployees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    @Override
    public boolean equals(Object obj) {
        Organization org = (Organization) obj;
        return org instanceof Object;
    }
}

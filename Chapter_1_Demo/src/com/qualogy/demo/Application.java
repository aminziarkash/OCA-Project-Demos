package com.qualogy.demo;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    private boolean hasDrivingLicense;

    private Scanner userInput;

    public Application() {

        //
        // create header section
        printHeader();

        //
        // create scanner
        userInput = new Scanner(System.in);

        //
        // get name
        out.println("Enter name");
        String employeeName = userInput.nextLine().toUpperCase();

        //
        // get age
        out.println("Enter age");
        int age = 0;
        while (age == 0) {
            try {
                age = userInput.nextInt();
            } catch (InputMismatchException e) {
                out.println("Bad input: " + userInput.next() + "\nPlease enter a valid age.");
            }
        }

        //
        // get driver license status
        out.println("Do you have a drivers license? Type 'Y' for yes and 'N' for no.");
        checkDriversLicense();

        //
        // close scanner
        userInput.close();

        //
        // print employee information
        out.println("\nCheck below for employee information\n");
        Employee employee = new Employee(employeeName, age, hasDrivingLicense);
        printEmployeeInfo(employee);

        //
        // get employee roles and print out. Array of Strings
        getEmployeeRolesArray();

        //
        // get job locations and print out. ArrayList containing Enum values
        getJobLocationsEnum();
    }

    /**
     * Get employee roles in an an array and print them as string values
     */
    public void getEmployeeRolesArray() {
        String[] employeeRoles =
            new String[]{"Software Developer", "Computer Systems Analyst", "Databas Administrator"};
        out.println("Available jobs \t:\t" + Arrays.toString(employeeRoles));
    }

    /**
     * Get job locations enum and put them inside an ArrayList
     */
    public void getJobLocationsEnum() {
        ArrayList<String> jobLocations = new ArrayList<String>();
        for (LocationsEnum locations : LocationsEnum.values()) {
            jobLocations.add(locations.getDesc());
        }
        out.println("Job Locations \t:\t" + jobLocations);
    }

    /**
     * Checks for driver license status
     * 
     * @return driver license status
     */
    private boolean checkDriversLicense() {
        String hasDriverLicenseString = userInput.next();
        if (hasDriverLicenseString.equalsIgnoreCase("y")) {
            hasDrivingLicense = true;
        } else if (hasDriverLicenseString.equalsIgnoreCase("n")) {
            hasDrivingLicense = false;
        }
        return hasDrivingLicense;
    }

    /**
     * print the header
     */
    public void printHeader() {
        out.println("OCA/OCP Java SE 7 Programmer I & II, CHAPTER 1 DEMO | Employee application \n");
        out.println("Please enter the following information for the employee registration");
    }

    /**
     * Print employee information
     * 
     * @param employee
     */
    public void printEmployeeInfo(Employee employee) {
        out.println("Name\t\t:\t" + employee.getName());
        out.println("Age\t\t:\t" + employee.getAge());
        out.println("Drivers license\t:\t" + employee.hasDrivingLicense() + "\n");
    }
}

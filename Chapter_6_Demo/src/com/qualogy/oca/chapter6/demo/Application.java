package com.qualogy.oca.chapter6.demo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author aziarkash
 *
 */
public final class Application {

    public final Employee nullPointerEmployee = null;
    
    public Application() {

        printHeader(); // print the objectives string
        
        usingIfAndSwitch(3); // using the if and switch statements
        
        developForDoAndWhileLoops(3); // for, do and while loops | break and continue statements are also used here
        
        usingTryCatchAndFinally(); // use try catch and finally to catch wrong employee age
        
        exceptionHandling(); // exceptions and exception handling
        
    }
    
    public void exceptionHandling() {
        
        createArithmeticException(2); // ArithmeticException
        
        createIndexOutOfBoundException();
        
        try {
            createNullPointerException(nullPointerEmployee);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException\t\t:\tNo employee object found");
        }
    }
    
    public void createNullPointerException(final Employee employee) throws NullPointerException {
        System.out.println("\ngetting employees name without instanciating it...");
        employee.getName();
    }
    
    public void createIndexOutOfBoundException() {
        System.out.println("\naccessing 9th employee on the list...");
        final ArrayList<Employee> employeeList = getEmployeeList();
        
        try {
            employeeList.get(9);
        } catch (final IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException\t:\t" + e.getMessage());
        }
    }
    
    public void createArithmeticException (int a) {
        System.out.println("\ndeviding number of employees to 0...");
        
        try {
            a = a/0;
        } catch (final ArithmeticException e) {
            System.out.println("ArithmeticException\t\t:\tCannot devide by 0");
        }
    }

    public void usingTryCatchAndFinally() {
        final Employee employee = new Employee();
        final Scanner userInput = new Scanner(System.in);
        System.out.println("EXCEPTIONS:");
        addSeperator();
        System.out.print("please enter employee age\t:\t");
        
        try {
            final int age = userInput.nextInt();
            employee.setAge(age);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException\t\t:\tNo text allowed! Numbers only");
        } finally {
            // cleanup
            userInput.close();
        }
    }
    
    public void developForDoAndWhileLoops(final int numOfEmployees) {
        
        employeesBasicForLoop(); // basic for loop

        setUpEmployeeList(); // enhanced for loop
        
        employeesDoAndDoWhileLoop(numOfEmployees); // while and do while loop
        
        addSeperator();
    }
    
    public void employeesDoAndDoWhileLoop(int numOfEmployees) {

        System.out.println("\nlooping through employees using WHILE and DO WHILE loop");
        System.out.println("number of employees\t\t:\t" + numOfEmployees);

        while (numOfEmployees <= 3) {
            System.out.println("inside the while loop\t\t:\t" + (numOfEmployees <= 3));
            numOfEmployees++;
        }

        System.out.println("\nnumber of employees changed to\t:\t" + numOfEmployees);        
        do {
            System.out.println("inside the do loop\t\t:\t" + (numOfEmployees == 4));
        } while (false);
    }
    
    public void employeesBasicForLoop () {
        
        final String[] empName = {"employee1", "employee2", "employee3"};
        System.out.println("number of employees in the array\t:\t" + empName.length);
        System.out.println("\nlooping through the array using BASIC for loop and returning employees ID...");

        for (int i = 0; i < empName.length; i++) {
            System.out.println("employee ID\t\t:\t" + empName[i]);
        }
    }
    
    public void usingIfAndSwitch(int numOfEmployees) {
        System.out.println("FLOW CONTROL:");
        addSeperator();
        
        if (numOfEmployees == 0) {
            System.out.println("number of employees cannot be 0");
        } else {
            switch (numOfEmployees) {
                case 1:
                    numOfEmployees = 1;
                    break;
                case 2:
                    numOfEmployees = 2;
                    break;
                case 3:
                    numOfEmployees = 3;
                    break;
                default: 
                    System.out.println("number of employees is greater than what the program can handle");
            }
        }
        System.out.println("setting number of employees using the switch statement\t:\t" + numOfEmployees);
        addSeperator();
    }

    public void setUpEmployeeList() {
        
        System.out.println("\nsetting up employee names using the ENHANCED for loop...");
        final ArrayList<Employee> employeeList = getEmployeeList();
        final String[] empNames = {"Amin Ziarkash", "Arno Brugman", "Micha Cohen"};

        outer:
        for (Employee employee : employeeList) {
            for (int i = 0; i < employeeList.size(); i++) {
                employee.setName(empNames[i]);
                System.out.println("employee name\t\t:\t" + empNames[i]);
            }
            break outer; // used to exit the loop, otherwise it will iterate 3 times
        }
    }

    ArrayList<Employee> getEmployeeList() {

        final ArrayList<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            final Employee employee = new Employee();
            System.out.println(i);
            if (employeeList.size() > 3) {
                continue;
            }
            employeeList.add(employee);
        }
        return employeeList;
    }
    
    public void printHeader() { 
        System.out.println("OCA CHAPTER 6 - FLOW CONTROL AND EXCEPTION HANDLING - DEMO\n");
        System.out.println("Objectives:\n");
        System.out.println("-   Use if and switch statements");
        System.out.println("-   Develop for, do and while loops");
        System.out.println("-   Use break and continue Statements");
        System.out.println("-   Use try, catch, and finally Statements");
        System.out.println("-   State the Effects of Exceptions");
        System.out.println("-   Recognize Common Exceptions\n");
        addSeperator();
    }
    
    public void addSeperator() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }
}

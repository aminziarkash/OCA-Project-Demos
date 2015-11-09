package com.qualogy.demos.ch4;

import java.util.Scanner;

public class Application {

    String orgName;

    int numOfEmployees;

    Scanner userInput;

    Organization organization;

    Organization firstOrg;

    Organization secondOrg;

    public Application() {

        // create the header
        createHeader();

        // create organizations | Assignment operators
        firstOrg = createOrganization();
        secondOrg = createOrganization();
        userInput.close();

        addSeperatorLine();

        // equals/!equals to compare names
        compareOrgNames();

        // == to compare number of employees and also used RELATIONAL, ARITHMERITIC and CONDITIONAL OPERATORS
        // to compare values
        compareNumOfEmployees();
        moreOperators();

        // "instanceof", logical operators and object references
        checkInstanceAndRef();
    }

    public void moreOperators() {
        int first = firstOrg.getNumOfEmployees();
        int second = secondOrg.getNumOfEmployees();

        // conditional operator
        String orgType = (first < 50) ? "Small" : "Medium-sized";
        System.out.println("And the organization type is\t\t:\t" + orgType);

        int totalEmployees = first + second;
        System.out.println("And the total for both organizations\t:\t" + totalEmployees + "\n");

        // add another employee to the first organization
        first++;
        System.out.println(
            "By adding another employee to the FIRST organization the counter is incremented by 1\t:\t"
                    + first);

        // add another employee to the first organization
        second /= 2;
        System.out.println(
            "And if you devide the number of employees in the second organization by 2 you will get\t:\t"
                    + second);
        addSeperatorLine();
    }

    public void checkInstanceAndRef() {
        System.out.println("Checking instances...");
        if (firstOrg instanceof Organization && secondOrg instanceof Organization) {
            System.out.println("Both organizations are instances of the Organization object");
        } else if (firstOrg instanceof Object || secondOrg instanceof Object) {
            System.out.println("At least one of the organizations is an instance of the Object object");
        }

        // referencing anotherOrg to firstOrg
        Organization anotherOrg = firstOrg;

        System.out.println("\nChecking references...");
        System.out.println("first org == second org\t\t\t?\t" + (firstOrg.equals(secondOrg)));
        System.out.println("first org == another org referenced\t?\t" + (firstOrg == anotherOrg));
        addSeperatorLine();
    }

    public void compareNumOfEmployees() {
        System.out.println("Comparing amount of employees in both organizations...");
        int first = firstOrg.getNumOfEmployees();
        int second = secondOrg.getNumOfEmployees();
        String message = null;

        if (first == second) {
            message = "They both have the same amount of employees";
        } else if (first > second) {
            message = "The FIRST organizartion has MORE employees";
        } else if (first < second) {
            message = "The SECOND organizartion has MORE employees";
        }
        System.out.println(message);
    }

    public void compareOrgNames() {
        System.out.println("Comparing organization names...");
        if (!firstOrg.getName().equals(secondOrg.getName())) {
            System.out.println("The organization names are not the same");
        } else {
            System.out.println("Both organizations have the samen name");
        }
        addSeperatorLine();
    }

    public Organization createOrganization() {
        organization = new Organization();
        userInput = new Scanner(System.in);
        addSeperatorLine();
        System.out.print("Enter organization name\t\t:\t");
        orgName = userInput.nextLine();
        organization.setName(orgName);
        System.out.print("Enter number of employees\t:\t");
        numOfEmployees = userInput.nextInt();
        organization.setNumOfEmployees(numOfEmployees);

        return organization;
    }

    public void createHeader() {
        System.out.println("DEMO OCA CHAPTER 4 - OPERATORS\n\nEnter 2 organization to compare details\n");
    }

    public void addSeperatorLine() {
        System.out.println(
            "-----------------------------------------------------------------------------------------------------");
    }
}

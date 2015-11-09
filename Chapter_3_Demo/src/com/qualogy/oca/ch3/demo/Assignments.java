package com.qualogy.oca.ch3.demo;

import java.awt.Dimension;
import java.util.Date;
import java.util.Scanner;

public class Assignments {

    public static void main(String[] args) {

        getLiterals();

        getCastingExample();

        getArrayInstanciating();

        getGarbageCollection();

        getDate();

        passingObjectReference();

        getReferenceExample();

    }

    public static void passingObjectReference() {
        // passing object reference variables from modify method below
        Dimension dim = new Dimension(5, 3);
        Assignments testing = new Assignments();
        System.out.println("Before modify() dimension.height = " + dim.height);
        testing.modify(dim);
        System.out.println("After modify() dimension.height = " + dim.height);
    }

    private static void getLiterals() {
        // numeric literals with underscores
        int oneMillion = 1_000_000;
        System.out.println(
            "One million int variable with underscores between the zeros for readablitiy : " + oneMillion);

        // decimal literals
        int decLiteral = 234;
        System.out.println("Decimal literal :\t" + decLiteral);

        // binary literals
        int binaryLiteral = 0B10110010;
        System.out.println("Binary \t\t:\t10110010\t=\t" + binaryLiteral);

        // octal literals
        int eight = 010;
        System.out.println("Octal\t\t:\t010\t\t=\t" + eight);

        // hexadecimal literals
        int hexa = 0x4ffbceaa;
        System.out.println("Hexa\t\t:\t4FFBCEAA\t=\t" + hexa);

        // floating point literals
        double dbl = 237465.7634765;
        System.out.println("Floating points\t:\t" + dbl);

        // boolean literals
        boolean fls = false;
        System.out.println("Boolean literal\t:" + fls);

        // characters
        char aChar = 'a';
        System.out.println("Char : " + aChar);
    }

    // passing object reference variables
    void modify(Dimension dim) {
        dim.height = dim.height + 1;
    }

    public static void getReferenceExample() {
        // object reference Instance variables
        Book book = new Book();
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        book.setBookTitle(input);
        if (input != null) {
            System.out.println(input);
        }
        userInput.close();
    }

    public static void getCastingExample() {
        // implicit cast
        int a = 34;
        long b = a;
        System.out.println(a + " | " + b);

        // explicit cast //could lose info after the comma
        float x = 16756.001f;
        int z = (int) x;
        float c = z;
        System.out.println(x + " | " + z + " | " + c);

        // assigning a literal that is too large for the variable
        byte ab = (byte) 128;
        System.out.println(ab);

        long l = 630L;
        byte bte = (byte) l;
        System.out.println(bte);

    }

    public static void getArrayInstanciating() {
        // Array instance variables
        int[] year = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Year[" + i + "] = " + year[i]);
        }
    }

    public static void getGarbageCollection() {
        // GARBAGE COLLECTION

        // nulling a reference
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println(sb);
        sb = null;

        // reassigning a reference variable
        String s1 = "Hello";
        String s2 = "GoodBye";
        System.out.println(s1);
        s1 = s2;
        // now s1 is eligible for collection
    }

    public static Date getDate() {
        Date date = new Date();
        String now = date.toString();
        System.out.println(now);

        return date;
    }
}

package org.example.s4.task3.before;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return false;
    }

    public static void runTests() {
        boolean expected1 = true;
        boolean actual1 = isLeapYear(2024);
        if (expected1 == actual1) {
            System.out.println("Test case 1 passed ");
        } else {
            System.out.println("Test case 1 failed because expected1 is " + expected1 + " but actual1 is " + actual1);
        }
        boolean expected2 = false;
        boolean actual2 = isLeapYear(2022);
        if (expected2 == actual2) {
            System.out.println("Test case 2 passed ");
        } else {
            System.out.println("Test case 2 failed because expected2 is " + expected2 + " but actual2 is " + actual2);
        }
        boolean expected3 = false;
        boolean actual3 = isLeapYear(1990);
        if (expected3 == actual3) {
            System.out.println("Test case 3 passed ");
        } else {
            System.out.println("Test case 3 failed because expected3 is " + expected3 + " but actual3 is " + actual3);
        }
        boolean expected4 = true;
        boolean actual4 = isLeapYear(2048);
        if (expected4 == actual4) {
            System.out.println("Test case 4 passed ");
        } else {
            System.out.println("Test case 4 failed because expected4 is " + expected4 + " but actual4 is " + actual4);
        }
    }

    public static void main(String[] args) {
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = scanner.nextInt();

        // Calculate the result with the user input
        boolean result = isLeapYear(year);
        System.out.println("Result is " + result);
    }
}

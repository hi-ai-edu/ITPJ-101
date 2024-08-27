package org.example.s4.task4.before;

import java.util.Scanner;

public class DayName {
    public static String getDayName(int day) {
        return "Invalid day";
    }

    public static void runTests() {
        String expected1 = "Friday";
        String actual1 = getDayName(1);
        if (expected1.equals(actual1)) {
            System.out.println("Test case 1 passed ");
        } else {
            System.out.println("Test case 1 failed because expected1 is " + expected1 + " but actual1 is " + actual1);
        }

        String expected2 = "Saturday";
        String actual2 = getDayName(2);
        if (expected2.equals(actual2)) {
            System.out.println("Test case 2 passed ");
        } else {
            System.out.println("Test case 2 failed because expected2 is " + expected2 + " but actual2 is " + actual2);
        }

        String expected3 = "Sunday";
        String actual3 = getDayName(3);
        if (expected3.equals(actual3)) {
            System.out.println("Test case 3 passed ");
        } else {
            System.out.println("Test case 3 failed because expected3 is " + expected3 + " but actual3 is " + actual3);
        }

        String expected4 = "Monday";
        String actual4 = getDayName(4);
        if (expected4.equals(actual4)) {
            System.out.println("Test case 4 passed ");
        } else {
            System.out.println("Test case 4 failed because expected4 is " + expected4 + " but actual4 is " + actual4);
        }

        String expected5 = "Tuesday";
        String actual5 = getDayName(5);
        if (expected5.equals(actual5)) {
            System.out.println("Test case 5 passed ");
        } else {
            System.out.println("Test case 5 failed because expected5 is " + expected5 + " but actual5 is " + actual5);
        }

        String expected6 = "Wednesday";
        String actual6 = getDayName(6);
        if (expected6.equals(actual6)) {
            System.out.println("Test case 6 passed ");
        } else {
            System.out.println("Test case 6 failed because expected6 is " + expected6 + " but actual6 is " + actual6);
        }

        String expected7 = "Thursday";
        String actual7 = getDayName(7);
        if (expected7.equals(actual7)) {
            System.out.println("Test case 7 passed ");
        } else {
            System.out.println("Test case 7 failed because expected7 is " + expected7 + " but actual7 is " + actual7);
        }

        String expected8 = "Invalid day";
        String actual8 = getDayName(0);
        if (expected8.equals(actual8)) {
            System.out.println("Test case 8 passed ");
        } else {
            System.out.println("Test case 8 failed because expected8 is " + expected8 + " but actual8 is " + actual8);
        }

        String expected9 = "Invalid day";
        String actual9 = getDayName(8);
        if (expected9.equals(actual9)) {
            System.out.println("Test case 9 passed ");
        } else {
            System.out.println("Test case 9 failed because expected9 is " + expected9 + " but actual9 is " + actual9);
        }
    }

    public static void main(String[] args) {
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the corresponding day: ");
        int day = scanner.nextInt();

        // Calculate the result with the user input
        String dayName = getDayName(day);
        System.out.println("The day for " + day + " is " + dayName);
    }
}

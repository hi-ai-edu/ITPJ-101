package org.example.s4.task5.before;

import java.util.Scanner;

public class SimpleCalculator {
    // Function to calculate based on operator
    public static int calculate(int num1, int num2, String operator) {
        return -1;
    }

    // Function to run test cases
    public static void runTests() {
        // Test 1: Addition
        int expected1 = 7;
        int actual1 = calculate(3, 4, "+");
        if (expected1 == actual1) {
            System.out.println("Test case 1 passed");
        } else {
            System.out.println("Test case 1 failed because expected1 is " + expected1 + " but actual1 is " + actual1);
        }

        // Test 2: Subtraction
        int expected2 = -1;
        int actual2 = calculate(3, 4, "-");
        if (expected2 == actual2) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed because expected2 is " + expected2 + " but actual2 is " + actual2);
        }

        // Test 3: Multiplication
        int expected3 = 12;
        int actual3 = calculate(3, 4, "*");
        if (expected3 == actual3) {
            System.out.println("Test case 3 passed");
        } else {
            System.out.println("Test case 3 failed because expected3 is " + expected3 + " but actual3 is " + actual3);
        }

        // Test 4: Division
        int expected4 = 0;
        int actual4 = calculate(3, 4, "/");
        if (expected4 == actual4) {
            System.out.println("Test case 4 passed");
        } else {
            System.out.println("Test case 4 failed because expected4 is " + expected4 + " but actual4 is " + actual4);
        }

        // Test 5: Division with non-zero result
        int expected5 = 2;
        int actual5 = calculate(8, 4, "/");
        if (expected5 == actual5) {
            System.out.println("Test case 5 passed");
        } else {
            System.out.println("Test case 5 failed because expected5 is " + expected5 + " but actual5 is " + actual5);
        }

        // Test 6: Invalid operator
        int expected6 = -1;
        int actual6 = calculate(3, 4, "%");
        if (expected6 == actual6) {
            System.out.println("Test case 6 passed");
        } else {
            System.out.println("Test case 6 failed because expected6 is " + expected6 + " but actual6 is " + actual6);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        // Calculate the result based on user input
        int result = calculate(num1, num2, operator);

        if (result != -1) {
            System.out.println("The result is: " + result);
        }
    }
}

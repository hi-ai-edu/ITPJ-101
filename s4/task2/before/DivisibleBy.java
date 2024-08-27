package org.example.s4.task2.before;

import java.util.Scanner;

public class DivisibleBy {
    public static boolean isDivisibleBy(int firstNumber, int secondNumber){
        return false;
    }

    public static void runTests(){
        boolean expected1 = true;
        boolean actual1 = isDivisibleBy(4,2);
        if(expected1 == actual1){
            System.out.println("Test case 1 passed ");
        }else{
            System.out.println("Test case 1 failed because expected1 is "+ expected1 +" but actual1 is "+actual1);
        }
        boolean expected2 = true;
        boolean actual2 = isDivisibleBy(3,1);
        if(expected2 == actual2){
            System.out.println("Test case 2 passed ");
        }else{
            System.out.println("Test case 2 failed because expected2 is "+ expected2 +" but actual2 is "+actual2);
        }
        boolean expected3 = false;
        boolean actual3 = isDivisibleBy(2,4);
        if(expected3 == actual3){
            System.out.println("Test case 3 passed ");
        }else{
            System.out.println("Test case 3 failed because expected3 is "+ expected3 +" but actual3 is "+actual3);
        }
        boolean expected4 = false;
        boolean actual4 = isDivisibleBy(5,3);
        if(expected4 == actual4){
            System.out.println("Test case 4 passed ");
        }else{
            System.out.println("Test case 4 failed because expected4 is "+ expected4 +" but actual4 is "+actual4);
        }
        boolean expected5 = false;
        boolean actual5 = isDivisibleBy(100,3);
        if(expected5 == actual5){
            System.out.println("Test case 5 passed ");
        }else{
            System.out.println("Test case 5 failed because expected5 is "+ expected5 +" but actual5 is "+actual5);
        }
        boolean expected6 = true;
        boolean actual6 = isDivisibleBy(102,3);
        if(expected6 == actual6){
            System.out.println("Test case 6 passed ");
        }else{
            System.out.println("Test case 6 failed because expected6 is "+ expected6 +" but actual6 is "+actual6);
        }
    }

    public static void main(String []args){
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();

        // Calculate the result with the user input
        boolean result = isDivisibleBy(num1, num2);
        System.out.println("Result is "+result);
    }
}


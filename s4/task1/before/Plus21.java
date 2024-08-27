package org.example.s4.task1.before;

import java.util.Scanner;

public class Plus21 {
    public static boolean isPlus21(int age){
        return true;
    }

    public static void runTests(){
        boolean expected1 = true;
        boolean actual1 = isPlus21(50);
        if(expected1 == actual1){
            System.out.println("Test case 1 passed ");
        }else{
            System.out.println("Test case 1 failed because expected1 is "+ expected1 +" but actual1 is "+actual1);
        }
        boolean expected2 = false;
        boolean actual2 = isPlus21(21);
        if(expected2 == actual2){
            System.out.println("Test case 2 passed ");
        }else{
            System.out.println("Test case 2 failed because expected2 is "+ expected2 +" but actual2 is "+actual2);
        }
        boolean expected3 = false;
        boolean actual3 = isPlus21(5);
        if(expected3 == actual3){
            System.out.println("Test case 2 passed ");
        }else{
            System.out.println("Test case 2 failed because expected3 is "+ expected3 +" but actual3 is "+actual3);
        }
    }

    public static void main(String []args){
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        // Calculate the result with the user input
        boolean result = isPlus21(age);
        System.out.println("Result is "+result);
    }
}

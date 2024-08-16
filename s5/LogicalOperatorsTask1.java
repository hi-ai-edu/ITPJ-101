package org.example;

public class LogicalOperatorsTask1 {
    public static void main(String [] args){
        System.out.println("Hello");
        // 2,3,4 >> 4
        // 7,4,6 >> 7
        // 50 , 200 , 800 >> 800

        //Steps
        // if first number > second and first > third , return first
        // else if second > first and second > third , return second
        // else return third

        runTests();
    }

    public static void runTests(){
        int expected1 = 4;
        int actual1 = findMax(2,3,4);
        if(expected1 == actual1){
            System.out.println("Test case 1 passed");
        }else{
            System.out.println("Test case 1 failed , actual value is "+actual1);
        }
        int expected2 = 7;
        int actual2 = findMax(7,4,6);
        if(expected2 == actual2){
            System.out.println("Test case 2 passed");
        }else{
            System.out.println("Test case 2 failed , actual value is "+actual2);
        }
        int expected3 = 800;
        int actual3 = findMax(50,200,800);
        if(expected3 == actual3){
            System.out.println("Test case 3 passed");
        }else{
            System.out.println("Test case 3 failed , actual value is "+actual3);
        }
        int expected4 = 50;
        int actual4 = findMax(50,50,40);
        if(expected4 == actual4){
            System.out.println("Test case 4 passed");
        }else{
            System.out.println("Test case 4 failed , actual value is "+actual4);
        }
        int expected5 = 13;
        int actual5 = findMax(13,13,13);
        if(expected5 == actual5){
            System.out.println("Test case 5 passed");
        }else{
            System.out.println("Test case 5 failed , actual value is "+actual5);
        }
    }

    public static int findMax(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3){
            return num1;
        }else if (num2 >= num1 && num2 >= num3){
            return num2;
        }else{
            return num3;
        }
    }
}

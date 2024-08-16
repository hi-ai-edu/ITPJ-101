package org.example;

public class LogicalOperatorsTask2 {
    public static void main(String args[]){
        //Accept any name with at least 4 chars , or Ali
        //Reject any name with less 4 chars and not Ali
        // Mohamed >> yes
        // Mo >> no
        // ali >> no
        // Ali >> yes
        // Ahmed >> yes

        //Steps
        // if name has at least 4 chars , or name = Ali >> return true
        // else return false

        runTests();
    }

    public static void runTests(){
        boolean expected1 = true;
        boolean actual1 = isAccepted("Mohamed");
        if(expected1 == actual1){
            System.out.println("Test case 1 passed");
        }else{
            System.out.println("Test case 1 failed , actual1 is "+actual1);
        }
        boolean expected2 = false;
        boolean actual2 = isAccepted("Mo");
        if(expected2 == actual2){
            System.out.println("Test case 2 passed");
        }else{
            System.out.println("Test case 2 failed , actual2 is "+actual2);
        }
        boolean expected3 = false;
        boolean actual3 = isAccepted("ali");
        if(expected3 == actual3){
            System.out.println("Test case 3 passed");
        }else{
            System.out.println("Test case 3 failed , actual3 is "+actual3);
        }
        boolean expected4 = true;
        boolean actual4 = isAccepted("Ali");
        if(expected4 == actual4){
            System.out.println("Test case 4 passed");
        }else{
            System.out.println("Test case 4 failed , actual4 is "+actual4);
        }
        boolean expected5 = true;
        boolean actual5 = isAccepted("Ahmed");
        if(expected5 == actual5){
            System.out.println("Test case 5 passed");
        }else{
            System.out.println("Test case 5 failed , actual5 is "+actual5);
        }
    }

    public static boolean isAccepted(String name){
        if(name.length() >= 4 || name.equals("Ali")){
            return true;
        }else{
            return false;
        }
    }

}

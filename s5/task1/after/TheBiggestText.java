package org.example.task1.after;

public class TheBiggestText {
    public static void main(String [] args){
        runTests();
    }

    public static void runTests(){
        String expected1 = "Egypt";
        String actual1 = findBiggestText("USA","Egypt");
        if(expected1.equals(actual1)){
            System.out.println("Test case 1 passed");
        }else{
            System.out.println("Test case 1 failed , actual value is "+actual1);
        }
        String expected2 = "Egypt";
        String actual2 = findBiggestText("Egypt","USA");
        if(expected2.equals(actual2)){
            System.out.println("Test case 2 passed");
        }else{
            System.out.println("Test case 2 failed , actual value is "+actual2);
        }
        String expected3 = "USA";
        String actual3 = findBiggestText("UK","USA");
        if(expected3.equals(actual3)){
            System.out.println("Test case 3 passed");
        }else{
            System.out.println("Test case 3 failed , actual value is "+actual3);
        }
        String expected4 = "UK";
        String actual4 = findBiggestText("UK","");
        if(expected4.equals(actual4)){
            System.out.println("Test case 4 passed");
        }else{
            System.out.println("Test case 4 failed , actual value is "+actual4);
        }
        String expected5 = ".";
        String actual5 = findBiggestText("",".");
        if(expected5.equals(actual5)){
            System.out.println("Test case 5 passed");
        }else{
            System.out.println("Test case 5 failed , actual value is "+actual5);
        }
        String expected6 = "";
        String actual6 = findBiggestText("","");
        if(expected6.equals(actual6)){
            System.out.println("Test case 6 passed");
        }else{
            System.out.println("Test case 6 failed , actual value is "+actual6);
        }
    }

    public static String findBiggestText(String text1, String text2){
        if(text1.length() >= text2.length()){
            return text1;
        }else{
            return text2;
        }
    }
}

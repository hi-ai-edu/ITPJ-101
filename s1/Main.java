import java.util.Scanner;

public class Main {
    // Function to calculate (x + y) * z
    public static int calculate(int x, int y, int z) {
        return (x + y) * z;
    }

    // Function to run test cases
    public static void runTests() {
        // Test case 1
        int x1 = 1, y1 = 2, z1 = 3;
        int expected1 = 9; // (1 + 2) * 3 = 9
        int result1 = calculate(x1, y1, z1);
        if (result1 == expected1) {
            System.out.println("Test 1 passed: expected = " + expected1 + ", result = " + result1);
        } else {
            System.out.println("Test 1 failed: expected = " + expected1 + ", result = " + result1);
        }

        // Test case 2
        int x2 = 0, y2 = 0, z2 = 0;
        int expected2 = 0; // (0 + 0) * 0 = 0
        int result2 = calculate(x2, y2, z2);
        if (result2 == expected2) {
            System.out.println("Test 2 passed: expected = " + expected2 + ", result = " + result2);
        } else {
            System.out.println("Test 2 failed: expected = " + expected2 + ", result = " + result2);
        }

        // Test case 3
        int x3 = -1, y3 = 1, z3 = 2;
        int expected3 = 0; // (-1 + 1) * 2 = 0
        int result3 = calculate(x3, y3, z3);
        if (result3 == expected3) {
            System.out.println("Test 3 passed: expected = " + expected3 + ", result = " + result3);
        } else {
            System.out.println("Test 3 failed: expected = " + expected3 + ", result = " + result3);
        }

    }

    public static void main(String[] args) {
        // Run the tests
        runTests();

        // Accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();

        System.out.print("Enter value for z: ");
        int z = scanner.nextInt();

        // Calculate the result with the user inputs
        int result = calculate(x, y, z);
        System.out.println("Result is "+result);
    }
}

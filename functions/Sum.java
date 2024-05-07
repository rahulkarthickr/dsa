package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum =" + sum);
        scanner.close();
    }
    /*
     * or
     * public static int sum() {
     * Scanner scanner = new Scanner(System.in);
     * System.out.println("Enter the first number:");
     * int num1 = scanner.nextInt();
     * System.out.println("Enter the second number:");
     * int num2 = scanner.nextInt();
     * int sum = num1 + num2;
     * scanner.close();
     * return sum; //end of the function
     * }
     */
}

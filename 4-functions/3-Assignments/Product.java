import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        product(num1, num2);
        sc.close();
    }

    public static void product(int a, int b) {
        int result = a * b;
        System.out.println("Product of" + "  " + a + "  " + "and" + "  " + b + "  " + "is" + "  " + result);
    }
}

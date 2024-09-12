import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter third number:");
        int num3 = sc.nextInt();
        max(num1, num2, num3);
        min(num1, num2, num3);
        sc.close();
    }

    public static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}

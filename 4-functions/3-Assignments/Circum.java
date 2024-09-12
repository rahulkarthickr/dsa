import java.util.Scanner;

public class Circum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        float rad = sc.nextFloat();
        circum(rad);
        sc.close();
    }

    public static void circum(float rad) {
        double circumference = 2 * 3.14 * rad;
        System.out.println("Circumference of the circle = " + circumference);
    }
}

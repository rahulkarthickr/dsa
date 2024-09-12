import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        float rad = sc.nextInt();
        area(rad);
        sc.close();
    }

    public static void area(float rad) {
        double area = 3.14 * rad * rad;
        System.out.println("Area of the circle =" + area);
    }
}

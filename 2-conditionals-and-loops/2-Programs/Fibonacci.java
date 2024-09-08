import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);
        scanner.close();
    }
}

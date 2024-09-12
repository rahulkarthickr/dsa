import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sumof(num1, num2);
        sc.close();
    }

    public static void sumof(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}

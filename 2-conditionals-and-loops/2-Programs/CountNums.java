import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n /= 10;
        }
        System.out.println("The digit 3 appears " + count + " times in the entered integer.");
        scanner.close();
    }
}

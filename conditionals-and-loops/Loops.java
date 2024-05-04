import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) { // for loop
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // reads input from user

        for (int j = 0; j <= n; j++) { // for loop
            System.out.println(j);
        }

        int k = 1;
        while (k <= 5) { // while loop
            System.out.println(k);
            k += 1;
        }

        int l = 1;
        do { // do while loop
            System.out.println(l);
        } while (l != 1);

        scanner.close();
    }
}

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();
        System.out.println("Hello," + " " + ch + " " + "welcome!");
        scanner.close();
    }
}

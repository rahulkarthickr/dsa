import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().trim().charAt(0);
        // trim() - trims out extra space between characters
        // charAt() - prints the character mentioned at that partcular index
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        scanner.close();
    }
}

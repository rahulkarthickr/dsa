import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String name = sc.nextLine();
        float marks = sc.nextFloat();
        System.out.println(word);
        System.out.println(name);
        System.out.println(marks);
        sc.close();
    }
}

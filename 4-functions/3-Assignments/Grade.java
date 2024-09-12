import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        float percentage;
        float totalmarks = 0;
        System.out.println("Enter number of subjects :");
        count = sc.nextInt();
        System.out.println("Enter marks of" + " " + count + "subjects :");
        for (int i = 0; i < count; i++) {
            totalmarks += sc.nextInt();
        }
        System.out.println("Total Marks = " + totalmarks);
        percentage = (totalmarks / (count * 100)) * 100;
        System.out.println("Percentage = " + percentage);
        switch ((int) percentage / 10) {
            case 10:
            case 9:
                System.out.println("Grade = 'A+'");
                break;
            case 8:
                System.out.println("Grade = 'A'");
                break;
            case 7:
                System.out.println("Grade = 'B'");
                break;
            case 6:
                System.out.println("Grade = 'C'");
                break;
            case 5:
                System.out.println("Grade = 'D'");
                break;
            default:
                System.out.println("Grade = 'F'");
                break;
        }
        sc.close();
    }
}

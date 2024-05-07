import java.util.Scanner;

public class Department {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empID = scanner.nextInt();
        String department = scanner.next();

        switch (empID) {
            case 1:
                System.out.println("Sam");
                break;
            case 2:
                System.out.println("Shiva");
                break;
            case 3:
                System.out.println("Rahul");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department exists for Rahul");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
        scanner.close();
    }
}

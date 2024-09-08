import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        String deprt = sc.nextLine();
        switch (EmpID) {
            case 1:
                System.out.println("Rahull");
                break;
            case 2:
                System.out.println("Shiva");
                break;
            case 3:
                switch (deprt) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
            default:
                System.out.println("Please enter a vaild ID");
                break;
        }
        sc.close();
    }
}

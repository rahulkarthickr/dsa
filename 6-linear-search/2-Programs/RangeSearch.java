import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}

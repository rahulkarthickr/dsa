import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements :");
        int[] arr = new int[5];
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array =" + Arrays.toString(arr));
        System.out.println("Enter the target element in the array:");
        int target = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                System.out.println("Target element" + " " + target + " " + "is present in the array");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target element" + " " + target + " " + "is not present in the array");
        }
        sc.close();
    }
}

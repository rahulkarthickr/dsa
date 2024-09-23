import java.util.Arrays;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements to be in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array elements: " + Arrays.toString(arr));
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int ceilingValue = ceiling(arr, target);
        if (ceilingValue != -1) {
            System.out.println("Nearest ceiling of the target element: " + ceilingValue);
        } else {
            System.out.println("No ceiling element found for the target");
        }
        sc.close();
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}

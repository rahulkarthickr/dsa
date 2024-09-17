import java.util.Arrays;
import java.util.Scanner;

public class Minof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4 };
        Arrays.toString(arr);
        System.out.println(min(arr));
        sc.close();
    }

    public static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 4, 5, 12 };
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

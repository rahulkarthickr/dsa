import java.util.Arrays;
import java.util.Scanner;

public class ArrayPassingFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 3, 4, 5, 12 };
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        sc.close();
    }

    public static void change(int[] arr) {
        arr[0] = 99;
    }
}

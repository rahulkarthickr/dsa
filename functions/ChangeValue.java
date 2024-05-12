package functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        changes(arr);
        System.out.println(Arrays.toString(arr));
    }

    // If we make changes to the object via reference variable,
    // the actual object is changed
    public static void changes(int[] nums) {
        nums[0] = 99; // arr[0] is now changed to '99'
                      // as nums also actually pointing to the same array 'arr'
    }
}

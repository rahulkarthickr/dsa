public class MaxRange {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(max(arr, 1, 18));
    }

    public static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

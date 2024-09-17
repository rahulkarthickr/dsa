public class TwoDimensionalArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2 },
                { 3, 4 }
        };
        int target = 3;
        boolean found = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Element found");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

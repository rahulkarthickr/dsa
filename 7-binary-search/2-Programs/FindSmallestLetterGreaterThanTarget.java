import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);
        char[] letters = new char[sc.nextInt()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = sc.next().charAt(0);
        }
        System.out.println(nextGreatestLetter(letters, target));
        sc.close();
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}

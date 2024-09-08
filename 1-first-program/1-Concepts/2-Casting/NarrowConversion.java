import java.util.Scanner;

public class NarrowConversion {
    // Narrow Coversion is conversion of larger data type to smaller data type
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (67.55f); // 'float' type is explicitly converted to 'int'
        System.out.println(num);
        sc.close();
    }
}

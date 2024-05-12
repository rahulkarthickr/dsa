package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 87, 56, 65, 45);
    }

    public static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

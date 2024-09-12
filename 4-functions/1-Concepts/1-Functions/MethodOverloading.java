public class MethodOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Rahul");
    }

    public static void fun(int a) {
        System.out.println(a);
    }

    public static void fun(String name) {
        System.out.println(name);
    }
}

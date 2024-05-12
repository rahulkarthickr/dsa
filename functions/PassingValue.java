package functions;

public class PassingValue {
    public static void main(String[] args) {
        String name = "Rahul";
        greet(name);
    }

    // 'name' doesn't need to be the same while passing values to fns
    public static void greet(String namm) { // Here value of the reference variable 'name' is passed to 'naam' variable
        System.out.println(namm);
    }
}

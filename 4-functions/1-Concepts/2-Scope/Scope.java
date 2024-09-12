public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Variable 'a' can be accessed within main() scope and its value is" + a);
        System.out.println("Likewise variable 'b' is also accesible and it value is" + b);
    }

    public static void random() {
        System.out.println("Variable 'a' is not accessible in random() scope");
        // we cannot access a variable which is outside the fn scope
    }
}

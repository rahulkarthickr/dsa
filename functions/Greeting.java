package functions;

public class Greeting {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    public static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}

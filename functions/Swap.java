package functions;

public class Swap {
    public static void main(String[] args) {
        String Rahul = "Rahul";
        String Sam = "Sam";
        System.out.println("Before swapping:");
        System.out.println("String1: " + Rahul);
        System.out.println("String2: " + Sam);
        String result1 = swapping(Rahul, Sam);
        System.out.println("After swapping:");
        System.out.println("String1: " + result1);
        System.out.println("String2: " + Sam);
    }

    public static String swapping(String ch, String character) {
        System.out.println("Swapping...");
        String temp = ch;
        ch = character;
        character = temp;
        System.out.println(ch);
        return ch;
    }
}

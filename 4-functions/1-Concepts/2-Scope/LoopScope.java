public class LoopScope {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int a = 10;
            int b = 90;
            System.out.println("'a' is accessible inside the loop scope:" + a);
            System.out.println("Likewise with 'b':" + b);

        }
        System.out.println("We cannot execute 'System.out.println(i)' ");
        // since 'i' is not accessible outside the loop scope
    }
}

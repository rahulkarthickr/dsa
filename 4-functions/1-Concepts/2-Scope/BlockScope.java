public class BlockScope {
    public static void main(String[] args) {
        String name = "Shiva";
        int a = 10;
        int b = 20;
        System.out.println("Name before block scope:" + name);
        System.out.println("Variable 'a' can be accessed outside the upcoming block scope:" + a);
        System.out.println("Same applies to variable 'b':" + b);
        {
            name = "Rahul";
            System.out.println("Name inside block scope:" + name);
            // we are change the string but we cannot create new string
            // as strings are immutable i.e., cannot be changed
            a = 100; // value of 'a' is changed from 10to 100
            System.out.println("We cannot execute 'int a = 78;'");
            // we cannot re-initialize the same varibale within the same function scope
            int c = 99;
            System.out.println("Varaible 'c' is accessible inside this block scope and its value is" + c);
        }
        System.out.println(name);
        System.out.println(
                "Variable 'c' is not accessible outside the block scope which is actually declared inside the block scope");
        int c = 900;
        System.out.println("But variable 'c' can bre re-initialized outside the block scope and can be used:" + c);
    }
}

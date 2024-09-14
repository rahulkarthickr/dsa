import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        System.out.println(list);
        System.out.println("Does the array list contains '67'?" + list.contains(67));
        list.set(0, 99);
        System.out.println("Updated list" + list);
        sc.close();
    }
}

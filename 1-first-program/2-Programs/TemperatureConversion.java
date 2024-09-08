import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter temperature in cel :");
        float temp = sc.nextFloat();
        float tempf = (temp * 9 / 5) + 32;
        System.out.println(tempf);
        sc.close();
    }
}

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in Indian Rupees (INR): ");
        double inrAmount = scanner.nextDouble();
        double conversionRate = 0.014;
        double usdAmount = inrAmount * conversionRate;
        System.out.println("Equivalent amount in US Dollars (USD): " + usdAmount);
        scanner.close();
    }
}

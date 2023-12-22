import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.74);
        exchangeRates.put("JPY", 111.37);
        exchangeRates.put("INR", 75.0); // Indian Rupee
        exchangeRates.put("CNY", 6.45); // Chinese Yuan
        exchangeRates.put("CAD", 1.28); // Canadian Dollar
        exchangeRates.put("AUD", 1.36); // Australian Dollar

        System.out.println("Currency Converter");
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., USD, EUR): ");
        String fromCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(fromCurrency)) {
            System.out.println("Unsupported source currency.");
            return;
        }

        System.out.print("Enter the target currency (e.g., USD, EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(toCurrency)) {
            System.out.println("Unsupported target currency.");
            return;
        }

        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

        double result = amount * (toRate / fromRate);

        System.out.println("Converted amount in " + toCurrency + ": " + result);

        scanner.close();
    }
}


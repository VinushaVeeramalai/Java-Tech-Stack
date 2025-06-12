import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to get user input

        // Fixed conversion rates
        double usdToInr = 83.2;
        double eurToInr = 89.5;
        double gbpToInr = 104.3;

        System.out.println(" Welcome to Currency Converter ");

        // Input 1: User selects currency type
        System.out.println("Choose currency to convert to INR:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt(); // Reads currency choice from user

        // Input 2: User enters amount
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble(); // Reads amount from user

        double result = 0.0;

        // Conversion logic
        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.printf("Converted: ₹%.2f INR\n", result);
                break;
            case 2:
                result = amount * eurToInr;
                System.out.printf("Converted: ₹%.2f INR\n", result);
                break;
            case 3:
                result = amount * gbpToInr;
                System.out.printf("Converted: ₹%.2f INR\n", result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close(); // Close input stream
    }
}

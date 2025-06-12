import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Fixed Values:
        double usdToInr = 83.2;
        double eurToInr = 89.5;
        double gbpToInr = 104.3;

        System.out.println(" Welcome to Currency Converter ");

        //Step 1:
        System.out.println("Choose currency to convert to INR:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt(); 

       //Step 2:
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble(); 

        double result = 0.0;

        // Conversion :
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

        scanner.close(); 
    }
}

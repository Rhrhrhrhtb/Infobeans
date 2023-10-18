
import java.util.Scanner;

public class Que_44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for the quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Define the cost per unit
        int costPerUnit = 100;

        // Calculate the total cost
        int totalCost = quantity * costPerUnit;

        // Check if a discount should be applied
        if (totalCost > 1000) {
            // Apply a 10% discount
            double discountAmount = 0.10 * totalCost;
            totalCost -= discountAmount;
            System.out.println("10% Discount Applied!");
        }

        // Print the total cost
        System.out.println("Total Cost: " + totalCost);

    }
}

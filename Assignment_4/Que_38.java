
import java.util.Scanner;

public class Que_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Greater Than (>)");
        System.out.println("3. Equality (==)");

        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case '+':

                double sum = num1 + num2;
                System.out.println("Result: " + sum);
                break;

            case '>':

                if (num1 > num2) {
                    System.out.println(num1 + " is greater than " + num2);
                } else if (num2 > num1) {
                    System.out.println(num2 + " is greater than " + num1);
                } else {
                    System.out.println("Both numbers are equal.");
                }
                break;

            case '=':

                if (num1 == num2) {
                    System.out.println("Both numbers are equal.");
                } else {
                    System.out.println("Numbers are not equal.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please choose '+', '>', or '=='.");
                break;
        }

    }
}


import java.util.Scanner;

public class Que_45_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }
    }
}

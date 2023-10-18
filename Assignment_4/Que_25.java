
//  39 Q same 
import java.util.Scanner;

public class Que_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage >= 90) {
            System.out.println("A Graade");
        } else if (percentage >= 80 && percentage <= 90) {

            System.out.println("B Grade");

        } else if (percentage >= 60 && percentage <= 80) {
            System.out.println("C Grade");
        } else {
            System.out.println("D Grade");

        }

    }
}

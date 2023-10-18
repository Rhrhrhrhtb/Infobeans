
import java.util.Scanner;

public class Que_42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three angles of the triangle:");
        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();

        // Check if the sum of angles is equal to 180 degrees
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("These angles can form a valid triangle.");
        } else {
            System.out.println("These angles cannot form a valid triangle.");
        }

        
    }

}


import java.util.Scanner;

public class Que_22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if (marks <= 25) {
            System.out.println("F Grade");
        } else if (marks > 25 && marks <= 45) {
            System.out.println("E Grade");
        } else if (marks > 45 && marks <= 50) {

            System.out.println("D Grade");
        } else if (marks > 50 && marks <= 60) {

            System.out.println("C Grade");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("B Grade");
        } else {
            System.out.println("A Grade");
        }

    }
}

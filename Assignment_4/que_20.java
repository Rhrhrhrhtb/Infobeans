
import java.util.Scanner;

public class que_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hindi number");
        int a = sc.nextInt();

        System.out.println("Enter English number");
        int b = sc.nextInt();

        System.out.println("Enter Maths number");
        int c = sc.nextInt();

        System.out.println("Enter Physics number");
        int d = sc.nextInt();

        System.out.println("Enter Chemistry number");
        int e = sc.nextInt();

        int total = a + b + c + d + e;
        double percentage = total * 100 / 500;

        if (percentage >= 60) {
            System.out.println("you are passed with 1st divistion " + percentage);
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("you are passed with 2nd divistion " + percentage);
        } else if (percentage >= 33 && percentage <= 49) {
            System.out.println("you are passed with 3rd divistion " + percentage);
        } else {
            System.out.println("you are failed");
        }

    }
}

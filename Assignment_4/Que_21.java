
import java.util.Scanner;

public class Que_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        int length = sc.nextInt();

        System.out.println("Enter Breadth");
        int breadth = sc.nextInt();

        // square =a*a;
        if (length == breadth) {
            System.out.println("It is square");

        } else {
            System.out.println("not Square");
        }
    }
}

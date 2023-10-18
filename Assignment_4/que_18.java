
import java.util.Scanner;

public class que_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Both the numbers are equal");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + "  n1 is greater");
            } else {
                System.out.println(n2 + " n2 is greater");
            }
        }
    }
}

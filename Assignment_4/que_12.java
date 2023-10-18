
import java.util.Scanner;

public class que_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("before swapping " + a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping " + a + "  " + b);

    }
}

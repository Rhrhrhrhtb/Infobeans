
import java.util.Scanner;

public class Que_32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");

        int a = sc.nextInt();
        System.out.println("Enter number ");

        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " a is greater");
        } else {
            System.out.println(b + " b is greater");
        }

    }
}

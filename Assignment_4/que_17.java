
import java.util.Scanner;

public class que_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int days = sc.nextInt();

        int months = days / 30; // 
        int weeks = months * 7;
        days = days / 10;
        System.out.println(months);
        System.out.println(weeks);
    }
}

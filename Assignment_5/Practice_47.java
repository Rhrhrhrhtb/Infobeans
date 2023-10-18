
import java.util.Scanner;

public class Practice_47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first year");
        int year1 = sc.nextInt();
        System.out.println("Enter second number");
        int year2 = sc.nextInt();
        for (int i = year1; i <= year2; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println(i);
                }
            }

        }

    }
}

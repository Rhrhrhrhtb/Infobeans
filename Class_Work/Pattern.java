
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        // int num1 = sc.nextInt();

        // int num = 5;
        // for (int i = 1; i <= num; i++) {
        //     for (int j = i; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }
        int k = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");

        }


    }
}

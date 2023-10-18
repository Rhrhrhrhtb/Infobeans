// package Assignment_5;

import java.util.Scanner;

public class practice_60 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int result = 0;

        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.print(" Hello ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }
}

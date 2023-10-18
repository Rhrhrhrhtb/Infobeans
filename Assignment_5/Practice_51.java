// package Assignment_5;

import java.util.Scanner;

public class Practice_51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double num = sc.nextInt();
        double i, sum = 0;
        for (i = 1; i <= num; i++) {
            sum = sum + 1 / i;
        }
        System.out.print(sum + " ");

    }
}

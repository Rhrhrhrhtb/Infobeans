// package Assignment_5;
// 36.WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;

public class Practice_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // for (int i = 1; i <= num2; i++) {
        for (int i = num1; i <= num2; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();

        }

    }
}

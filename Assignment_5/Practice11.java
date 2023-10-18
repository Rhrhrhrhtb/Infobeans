//11. WAP to find out the sum of N natural number.
// package Assignment_5;

import java.util.Scanner;

public class Practice11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers is " + sum);
    }

}

// package Assignment_5;

import java.util.Scanner;

// 41.WAP to print all the even numbers between two entered numbers
public class Practice_41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

}

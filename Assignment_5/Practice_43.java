// package Assignment_5;

import java.util.Scanner;

// 43.WAP to print factorial of all the numbers between two entered numbers
public class Practice_43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int fact = 1;
        for (int i = num1; i <= num2; i++) {
            fact = fact * i;
            System.out.print(fact + " ");
        }
    }

}

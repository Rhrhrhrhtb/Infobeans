// package Assignment_5;

import java.util.Scanner;

// 44.WAP to print all the prime numbers between two entered numbers
public class Practice_44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {

            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                if (flag == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}

// package Assignment_5;

import java.util.Scanner;

// 37.WAP to find out all the perfect numbers between two entered numbers
public class Practice_37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int sum = 0;
            int temp = i;

            // System.out.print( i+" is ");
            for (int j = 1; j <= i - 1; j++) {
                if (i % j == 0) {
                    // System.out.print(j+" ");
                    sum += j;
                }

            }
            if (sum == temp) {
                System.out.print(i + " is perfect number");
                System.out.println(" ");
            }
        }
    }
}

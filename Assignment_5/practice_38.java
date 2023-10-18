// package Assignment_5;

import java.util.Scanner;

// 38.WAP to find out all the palindrome numbers between two entered numbers
public class practice_38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        // int temp = a;
        int rem, n, sum = 0;

        for (int i = num; i <= num1; i++) {
            int a = i;

            while (i > 0) {
                rem = i% 10;
                sum = sum * 10 + rem;
                i= i / 10;
            }

            if (sum == i) {
                System.out.println(i + "_____ ");
            }
        }
    }
}

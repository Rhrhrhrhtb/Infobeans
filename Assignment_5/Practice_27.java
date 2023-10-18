// package Assignment_5;
// 27.WAP to check whether entered number is palindrome or not

import java.util.Scanner;

public class Practice_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int temp = a;
        int rem, sum = 0;

        while (a > 0) {
            rem = a % 10;
            sum = (sum * 10 + rem);
            a = a / 10;

        }
        if (temp == sum) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }

    }
}

// package Assignment_5;

import java.util.Scanner;

// 28.WAP to check whether entered number is Armstrong or not
public class Practice_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int temp = a;
        int rem, sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            sum = (sum + rem * rem * rem);
            temp = temp / 10;

        }
        if (a == sum) {
            System.out.println("Armstrong ");
        } else {
            System.out.println("not Armstrong");
        }

    }
}

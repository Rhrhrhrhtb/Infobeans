// package Assignment_5;

import java.util.Scanner;

// 34.WAP to find out the sum of first and last digit of a user entered number
public class Practice_34 {

    public static void main(String[] args) {

        int n, fd = 0, ld, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        n = sc.nextInt();
        ld = n % 10;

        while (n > 0) {
            int rem = n % 10;
            fd = rem;
            n = n / 10;
        }
        sum = fd + ld;
        System.out.println(sum);

    }
}

//Q25.WAP to count number of digits
// package Assignment_5;

import java.util.Scanner;

public class Practice25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int count = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println("Number of digits is :" + count);
    }
}

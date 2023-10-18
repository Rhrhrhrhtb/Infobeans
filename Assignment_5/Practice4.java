//Q4. wap to check if a number is prime or not .
// package Assignment_5;

import java.util.Scanner;

public class Practice4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                break;
            } else {
                System.out.println("Prime");
                // break;
            }
        }
    }
}

// package Assignment_5;

import java.util.Scanner;

// 29.WAP to check whether entered number is strong or not
public class practice_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int fact1, sum = 0, temp;
        temp = num;

        while (temp > 0) {
            fact1 = temp % 10;
            int fact = 1;
            for (int i = 1; i <= fact1; i++) {
                fact = fact * i;

                // System.out.println(fact + " ");
            }
            sum = sum + fact;

            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(temp + " is a strong number");
        } else {
            System.out.println(temp + " is not a strong number");
        }
    }
}

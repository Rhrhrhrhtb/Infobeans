// package Assignment_5;

// 33.WAP to find out the sum of all the digits of a number
import java.util.Scanner;

public class practice_33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers is " + sum);
    }
}

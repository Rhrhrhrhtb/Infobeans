//10.WAP to print N natural number.
// package Assignment_5;

import java.util.Scanner;

public class Practice10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}

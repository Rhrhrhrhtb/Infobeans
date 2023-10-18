//18.WAP to print N odd numbers.
// package Assignment_5;

import java.util.Scanner;

public class Practice18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}

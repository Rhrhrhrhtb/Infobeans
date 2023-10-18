//16.WAP to print N even numbers.
// package Assignment_5;

import java.util.Scanner;

public class Practice16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

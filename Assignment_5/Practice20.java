//20.WAP to print N natural numbers in reverse order
// package Assignment_5;

import java.util.Scanner;

public class Practice20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

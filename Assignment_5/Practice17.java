//17.WAP to print Even numbers upto N.
// package Assignment_5;

import java.util.Scanner;

public class Practice17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}

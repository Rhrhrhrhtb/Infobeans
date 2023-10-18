// package Assignment_5;

import java.util.Scanner;

public class Practice_50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int a = 1, b = 2, c;

        System.out.println(a + " " + b + " ");
        for (int i = 1; i <= num; i++) {
            c = a * b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}

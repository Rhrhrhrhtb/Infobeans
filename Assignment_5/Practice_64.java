// package Assignment_5;

import java.util.Scanner;

public class Practice_64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int result = 0;
        int num = sc.nextInt();
        char ch = 'A';
        char ch2 = 'a';
        for (int ch1 = 1; ch1 <= num; ch1++) {
            if (ch1 % 2 == 0) {
                System.out.print(ch2 + " ");
            } else {
                System.out.print(ch + " ");
            }
            ch2++;
            ch++;

        }

    }
}

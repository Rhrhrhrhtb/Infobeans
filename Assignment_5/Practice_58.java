// package Assignment_5;

import java.util.Scanner;

public class Practice_58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double num = sc.nextInt();
        double result = 0, i;
        for (i = 0; i <= num; i = i + 2) {
            result = i * Math.pow(i, 2);
            System.out.print(result + " ");
        }

    }
}

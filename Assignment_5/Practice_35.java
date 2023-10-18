// package Assignment_5;  

import java.util.Scanner;

// 35.WAP to print tables of all the numbers between two entered numbers
public class Practice_35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a Second number: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");

            }
            System.out.println(" ");
        }
    }

}

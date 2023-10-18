// package Assignment_4;

import java.util.Scanner;

public class que_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bonus");
        int sale = sc.nextInt();

        int bonus = (sale * 20) / 100;
        int sum = sale + bonus;

        if (sum >= 10000) {

            System.out.println("congratulation you have a : " + bonus + " bonus " + sum);

        } else {
            System.out.println("you missed chance");
        }

    }
}

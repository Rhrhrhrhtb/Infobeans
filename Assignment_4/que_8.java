package Assignment_4;

import java.util.Scanner;

public class que_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a number is greater");
        } else {
            System.out.println("b number is grater");
        }
    }
}

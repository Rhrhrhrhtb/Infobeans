// package Assignment_4;

import java.util.Scanner;

public class que_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hindi marks");
        int a = sc.nextInt();

        System.out.println("Enter English marks");
        int b = sc.nextInt();

        System.out.println("Enter Maths marks");
        int c = sc.nextInt();

        System.out.println("Enter Science marks");
        int d = sc.nextInt();

        System.out.println("Enter Social science marks");
        int e = sc.nextInt();

        float ave = (a + b + c + d + e) / 5;

        if (ave >= 40) {
            System.out.println("pass");

        } else {
            System.out.println("Fail");
        }

    }
}

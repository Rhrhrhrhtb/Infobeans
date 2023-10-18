package Assignment_4;

import java.util.Scanner;

public class que_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18 && age <= 100) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("not eligible for voting5");
        }

    }
}

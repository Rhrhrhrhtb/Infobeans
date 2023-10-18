// package Assignment_5;

import java.util.Scanner;

public class Practice_63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int result = 0;

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            result = result * 10 + 9;
            System.out.print(result + " ");
        }
    }
}

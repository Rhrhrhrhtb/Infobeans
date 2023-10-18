// package Assignment_5;

import java.util.Scanner;

public class Practice_48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        for (int i = -6; i <= a; i = i + 3) {
            System.out.print(i + " ");
        }
    }
}

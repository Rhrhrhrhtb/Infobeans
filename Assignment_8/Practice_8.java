package Assignment_8;

import java.util.Scanner;

// 8.Write a program to find the sum and product of all elements of an array.
public class Practice_8 {

    public static void main(String[] args) {
        int sum = 0, product = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            product = product * arr[i];

        }

        System.out.println("Sum of Nmuber : " + sum);
        System.out.println("product of number : " + product);
    }
}

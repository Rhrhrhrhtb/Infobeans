package Assignment_9;
// 19.Write a Java program to find all pairs of elements in an array whose sum is
// equal to a specified number.

import java.util.Scanner;

public class Practice_19 {

    public static void main(String[] args) {
        int sum = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] +arr[j]== sum) {
                    System.out.println(arr[i] +" + "+ arr[j] + " ="+sum);
                }
            }

        }

    }
}

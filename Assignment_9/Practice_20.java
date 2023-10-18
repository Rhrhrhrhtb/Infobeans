package Assignment_9;
// 20.Write a Java program to test two arrays' equality.

import java.util.Scanner;

public class Practice_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr1[] = new int[size];
        System.out.println("Enter 1st array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter 2nd array element ");
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println("Arrays are equals  ");

                }

            }

        }

    }
}

package Assignment_9;
// 26.Write a Java program to check if an array of integers contains two specified
// elements 65 and 77.

import java.util.Scanner;

public class Practice_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 65 && arr[i] == 77) {
                System.out.println("Array of integers are present in the ele..");

            } else {
                System.out.println("element are not present ");
            }
        }

    }
}

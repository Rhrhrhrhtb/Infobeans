package Assignment_9;

import java.util.Scanner;

// 11.Write a Java program to find duplicate values in an array of integer values.
public class Practice_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter a Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate values are : " + arr[i] + " position are : " + i);
                }
            }
        }
    }
}

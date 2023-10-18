package Assignment_9;

import java.util.Scanner;

// 5.Write a Java program to find the index of an array element .
public class Practice_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter a value");
        int ele = 4;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                System.out.println("Array index  : " + i + " value of : " + arr[i]);

            }

        }

    }
}

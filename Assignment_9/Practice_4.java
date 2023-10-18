package Assignment_9;
// 4.Write a Java program to test if an array contains a specific value .

import java.util.Scanner;

public class Practice_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int num = 5;
        System.out.println("Enter a value");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Array contain in given element : " +  arr[i]);
            }

        }

    }
}

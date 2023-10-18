package Assignment_9;

import java.util.Scanner;

// 6.Write a Java program to remove a specific element from an array.
public class Practice_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the number you want to store ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to remove");
        int ele = sc.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            if (ele == arr[i]) {
                arr[i] = arr[i + 1];
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("After deletion : " + arr[i]);
        }
    }
}

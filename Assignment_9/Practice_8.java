package Assignment_9;

import java.util.Scanner;

// 8.Write a Java program to insert an element (specific position) into an array.
public class Practice_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int pos = 3;
        int ele = 300;
        System.out.println("Enter the value you want to store");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[pos - 1] = ele;

        }
        System.out.println("After inserting : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}

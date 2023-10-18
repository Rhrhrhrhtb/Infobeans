package Assignment_9;

import java.util.Scanner;

// 10.Write a Java program to reverse an array of integer values.
public class Practice_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter value");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse array : ");

        for (int i = size - 1; i > 0; i--) {
            System.out.print(arr[i]);
        }

    }
}

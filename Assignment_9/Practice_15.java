package Assignment_9;
// 15.Write a Java program to remove duplicate elements from an array.

import java.util.Scanner;

public class Practice_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int i;
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter loc ");
        int loc = sc.nextInt();
        for (i = loc; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];

        }
        size--;
        System.out.println(" Duplicate element : ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "     ");
        }
    }
}

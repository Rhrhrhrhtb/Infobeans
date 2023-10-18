package Assignment_9;

import java.util.Scanner;

// 17.Write a Java program to find the second smallest element in an array.
public class Practice_17 {

    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.println(arr[i]);
        }

        System.out.println("Second smallest  element is : " + arr[size - 2]);

    }
}

package Assignment_9;

import java.util.Scanner;

// 35.Write a Java program to find the smallest and second smallest elements of
// a given array.
public class Practice_35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // System.out.println(arr[i]);

        }
        System.out.println("Smallest number : " + arr[0]);
        System.out.println("Second smallest number : "+ arr[1]);

    }
}

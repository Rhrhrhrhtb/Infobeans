package Assignment_9;
// 24. Write a Java program to compute the average value of an array of integers
// except the largest and smallest values.

import java.util.Scanner;

public class Practice_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int sum = 0, avg = 0;
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element : " + min);
        System.out.println("Maximum element : " + max);

        avg = ((sum - max - min) / (size - 2));

        System.out.println(avg);

    }

}

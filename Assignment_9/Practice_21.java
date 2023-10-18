package Assignment_9;
// 21.Write a Java program to find a missing number in an array.

import java.util.Arrays;
import java.util.Scanner;

public class Practice_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        // int i;
        int sum = 0;
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // sum = (size + 1) * (size + 2) / 2;
        sum = size * (size + 1) / 2;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum - arr[i];
        }
        System.out.println("Missing Element : " + sum);

    }
}

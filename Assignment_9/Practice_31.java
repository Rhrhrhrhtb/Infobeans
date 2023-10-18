package Assignment_9;

import java.util.Scanner;

// 31 Write a Java program to get the majority element from an array of integers
// containing duplicates.
public class Practice_31 {

    public static void main(String[] args) {
        int count = 0;
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
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
                if (count == 1) {
                    System.out.println("Major element : " + arr[i]);
                    break;

                }

                count = 0;
            }
        }

    }
}

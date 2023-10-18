package Assignment_9;

import java.util.Scanner;

// 18.Write a Java program to add two matrices of the same size.
public class Practice_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        System.out.println("enter number ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second element ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of element : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();
        }

    }
}

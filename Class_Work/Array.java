// 2-D Array

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // int arr[][] = new int[2][3];
        // int a[][] = new int[2][3];

        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;
        // int a[][] = new int[2][3];
        // System.out.println(a[1][1]);
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        int arr2[][] = new int[2][3];

        System.out.println("Enter the Element ");

        System.out.println("enter number ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second element ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int arr3[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
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

        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //     }
        // }
        // for (int i = 0; i < 2; i++) {
        //     System.out.println();
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print(a[i][j]);
        //     }
        // }
        // compairing element 
        // System.out.println("enter element ");
        // int ele = sc.nextInt();
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         if (arr[i][j] == ele) {
        //             System.out.println("Element found index of : " + "(" + i + " " + j + ")");
        //         }
        //     }
        // }
    }
}

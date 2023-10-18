package Assignment_8;
// 5 wap to find and print even numbers in given array

import java.util.Scanner;

public class Practice_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println("Even number is : " + arr[i]);

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd Number is : " + arr[i]);
            }
        }

    }

}

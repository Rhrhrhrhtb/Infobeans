package Assignment_8;
// Q13. Write a program to array elements to print sum of Cubic Values

import java.util.Scanner;

public class Practice_13 {

    public static void main(String[] args) {
        int cubic = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter a Value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            cubic = cubic + arr[i] * arr[i] * arr[i];

        }
        System.out.println("Cubic value is : " + cubic);

    }
}

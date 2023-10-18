// Q.14Write a program in to array size to be user input print it
package Assignment_8;

import java.util.Scanner;

public class Practice_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arrays are : " + arr[i]);
        }

    }
}

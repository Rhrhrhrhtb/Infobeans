// Q.16 Write a Java program to calculate the average value of array elements.
package Assignment_8;

import java.util.Scanner;

public class Practice_16 {

    public static void main(String[] args) {
        int avg = 0, averag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter a Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
            averag = avg / size;

           

        }
 System.out.println("Sum of number : " + avg);
        System.out.print("Average of number : " + averag);

    }
}

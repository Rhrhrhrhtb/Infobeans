package Assignment_9;

import java.util.Scanner;

// 3.Write a Java program to calculate the average value of array element .
public class Practice_3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a Number");
        int sum = 0;
        int avg =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg =(sum/size);
        }
        System.out.println("Sum :" +sum);
        System.out.println("average :"+ avg);

    }
    
}

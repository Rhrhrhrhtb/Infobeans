package Assignment_9;

import java.util.Scanner;

// 9.Write a Java program to find the maximum and minimum value of an array.
public class Practice_9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        

        System.out.println("Enter your number ");
                int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // Maximum number 
                if (arr[i] > max) {
                     max = arr[i];
                }
        }
        System.out.println("Maximum Element : " + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("Manimum Element : " + min);
  
    }
    
}

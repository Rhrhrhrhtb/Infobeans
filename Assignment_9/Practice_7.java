package Assignment_9;
// 7.Write a Java program to copy an array by iterating the array.

import java.util.Scanner;

public class Practice_7 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr1[] =new int [arr.length];
                System.out.println("Enter a Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Copying all element from arr to arr1
        for(int i =0;i<arr.length;i++){
            arr1[i] =arr[i];    
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("printing original array : "+ arr[i]);
        }
        for(int j =0;j<arr1.length;j++){
            System.out.println("new array : "+ arr[j]);
        }
        


    }
}

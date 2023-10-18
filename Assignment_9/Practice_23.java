package Assignment_9;
// 23.Write a Java program to find the number of even and odd integers in a
// given array of integers.

import java.util.Scanner;

public class Practice_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
     
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even number : "+ arr[i]);
            }
            else{
                System.out.println("Odd number : "+ arr[i]);
            }
        }
    }
}

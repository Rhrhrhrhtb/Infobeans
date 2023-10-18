package Assignment_8;
// 3 wap to define an array of integer and assign value in program and print sum of all values

import java.util.Scanner;

public class Practice_3 {

    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your value");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            sum =sum+arr[i];
            
        }
        System.out.println(sum);

    }

}

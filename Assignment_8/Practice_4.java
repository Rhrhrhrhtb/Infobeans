package Assignment_8;
// 4 wap to print max and minimum value in given array

import java.util.Scanner;

public class Practice_4 {

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

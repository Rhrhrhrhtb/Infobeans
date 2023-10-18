package Assignment_9;
// 14.Write a Java program to find common elements between two integer
// arrays.

import java.util.Scanner;

public class Practice_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter 1st element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd element");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println("common elements : "+ arr1[i] + "  positions are : "+ i);
                }
            }
        }
    }

    
}

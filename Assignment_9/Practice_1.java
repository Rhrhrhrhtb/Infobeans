package Assignment_9;

import java.util.Scanner;

// 1.Write a Java program to sort a numeric array and a string array.
public class Practice_1 {

    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        String str[] = new String[size];
        // System.out.println("Enter a Number");
        // for(int i=0;i<arr.length;i++){
        //     arr[i] =sc.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        // int j ;
        //     for ( j = i+1; j < arr.length; j++) {
        //         if (arr[i] > arr[j]) {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;

        //         }
        //     }
        //                     System.out.println("Sort Arrays are : "+arr[i]);
        // }
        System.out.println("Enter String");
        int i;
        for (i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();

        }
        for (i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j])>0) {
                    String temp1 = str[i];
                    str[i] = str[j];
                    str[j] = temp1;

                }
            }

            System.out.println(str[i]);
        }
    }
}


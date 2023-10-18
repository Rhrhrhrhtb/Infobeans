// Q.17 Write a Java program to find duplicate values in an array ofstring values.
package Assignment_8;

import java.util.Scanner;

public class Practice_17 {

    public static void main(String[] args) {
        String str[] = {"tushar", "rohit", "rahul", "sumit"};
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size");
        // int size = sc.nextInt();
        String arr[] = new String[1];
        System.out.println("Enter Name");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str[i].equals(arr[j])) {
                    System.out.println("String found : " + str[i]);
                }
            }

        }

    }
}

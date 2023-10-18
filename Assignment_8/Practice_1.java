package Assignment_8;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("InReverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}

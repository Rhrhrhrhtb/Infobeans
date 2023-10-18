package Assignment_8;

import java.util.Scanner;

// 10.Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.
public class Practice_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a  value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("Positive value : " + arr[i]);

            }
            if (arr[i] < 0) {
                System.out.println("Negative value : " + arr[i]);

            }
            if (arr[i] % 2 == 0) {
                System.out.println("even value : " + arr[i]);

            } else {
                System.out.println("Odd number : " + arr[i]);

            }
        }

    }

}

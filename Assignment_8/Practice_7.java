package Assignment_8;

import java.util.Scanner;

// 7 wap to search a particular number in given array and print its position
public class Practice_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int ar[] = new int[size];
        int a = 44;

        System.out.println("enter first number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter Second number");
        for (int i = 0; i < arr.length; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == ar[j]) {
                    System.out.println("number is match : " + arr[i] + " position is :" + i);

                }
            }
        }

    }
}

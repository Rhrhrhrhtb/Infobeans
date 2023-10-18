package Assignment_8;

import java.util.Scanner;
// 2 wap to ask 5 names from user and check if particular name exists in array or not .

public class Practice_2 {

    public static void main(String[] args) {

        String[] str = {"Abhi", "Rohit", "Rahul", "Ajay"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size");
        int size = sc.nextInt();
        String arr[] = new String[size];
        System.out.println("Enter  your name : " );

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (arr[i].equals(str[j])) {
                    System.out.println(" element found index of : " + arr[i]);
                }
            } 

        }
    }
}

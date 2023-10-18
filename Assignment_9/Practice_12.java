package Assignment_9;
// 12.Write a Java program to find duplicate values in an array of string values.

import java.util.Scanner;

public class Practice_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("Enter String :");

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length - 1; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println("Duplicate values : " + str[i] + " position  : " + i);
                }
            }
        }

    }
}

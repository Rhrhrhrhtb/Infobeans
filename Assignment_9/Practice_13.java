package Assignment_9;
// 13.Write a Java program to find common elements between two arrays (string
// values).

import java.util.Scanner;

public class Practice_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        String str[] = new String[size];
        String str1[] = new String[size];
        System.out.println("Enter 1st String");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("Enter 2nd String");

        for (int j = 0; j < str1.length-1; j++) {
            str1[j] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                if (str[i].equals(str1[j])) {
                    System.out.println("Common element : " + str[i] + " position " + i);
                }

            }
        }

    }
}

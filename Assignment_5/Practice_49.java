// package Assignment_5;

import java.util.Scanner;

public class Practice_49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        // series =1+(n*(n+1))/2
        for (int i = 0; i < n; i++) {
            int series = 1 + ((i * (i + 1)) / 2);
            System.out.print(series + " ");

        }
    }

}

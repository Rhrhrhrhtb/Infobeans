//7 wap to ask a number from user and print table of that number
// package Assignment_5;

import java.util.Scanner;

public class Practice7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int ans = num * i;
            System.out.println(ans);
        }
    }
}

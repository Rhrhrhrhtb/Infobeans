//6 wap to print factorial of a number
//5*4*3*2*1
// package Assignment_5;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact + " ");
    }
}

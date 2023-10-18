//5. wap to print fibonacci series using for loop i.e adding 
//last two results ex 0 1 1 2 3 5 8 13 21 34
// package Assignment_5;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        System.out.println("Enter the term");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num1 = 0, num2 = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);

        }
    }
}

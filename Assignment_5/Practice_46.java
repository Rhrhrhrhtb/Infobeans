// package Assignment_5;

import java.util.Scanner;

public class Practice_46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int n = sc.nextInt();

        // square
        int square = n * n;
        int cube = n * n * n;
        double squraeroot = Math.sqrt(n);

        System.out.println("Square root : " + square);
        System.out.println("cube is :" + cube);
        System.out.println("Square Root is : " + squraeroot);
    }
}

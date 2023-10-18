// package Class_Work;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  1st number");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();

        int c = a + b;

        System.out.println("Addition of two number :" + c);
    }
}

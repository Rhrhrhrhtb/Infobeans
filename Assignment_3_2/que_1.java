package Assignment_3_2;

import java.util.Scanner;

public class que_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ave = 0;

        System.out.println("Enter the Number");
        int sum = 0;
        int a = sc.nextInt();
        for (int i = 0; i <= a; i = i + 2) {

            sum = sum + i;
            ave = sum / (a);
            System.out.println(i);

        }
        System.out.println(sum);
        System.out.println(ave);

    }
}

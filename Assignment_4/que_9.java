// package Assignment_4;

import java.util.Scanner;

public class que_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name");
        String product = sc.nextLine();
        System.out.println("Enter product price");
        int price = sc.nextInt();

        if (price > 2000) {
            double discount = (price * 10) / 100;

            System.out.println("congratulation your total 10% discount is " + discount);

        } else {
            double discount1 = (price * 7) / 100;
            System.out.println("congratulation total 7% discount is : " + discount1);
        }
    }
}

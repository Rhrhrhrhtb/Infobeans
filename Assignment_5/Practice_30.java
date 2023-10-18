// package Assignment_5;

// 30.WAP to count no. Of even and odd digits in a number
import java.util.Scanner;

public class Practice_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        int even = 0, odd = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n = n / 10;
        }
        System.out.println("even number is " + even);
        System.out.println("odd number is " + odd);
    }

}

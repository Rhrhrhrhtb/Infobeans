
import java.util.Scanner;

public class Practice_39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fisrt value");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int temp2 = i;
            int count = 0, sum = 0, rem = 0;

            while (temp2 != 0) {
                rem = temp2 % 10;
                count++;
                temp2 /= 10;
            }
            while (temp != 0) {
                rem = temp % 10;
                sum += Math.pow(rem, count);

                // count++;
                temp = temp / 10;

            }
            if (i == sum) {
                System.out.println(i + "  Armstrong number");

            }

        }
    }
}

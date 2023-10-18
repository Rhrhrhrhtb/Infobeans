
import java.util.Scanner;

public class Practice_40 {
    // 40.WAP to print all the strong numbers between two entered numbers

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fisrt value");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int sum = 0;

            // int ans = 1;
            while (temp > 0) {
                int ans = 1;
                int rem = temp % 10;
                temp /= 10;
                for (int j = 1; j <= rem; j++) {
                    ans = ans * j;

                }
                sum = sum + ans;
            }

            if (sum == i) {
                System.out.println(i + " Strong number");
            }

        }
    }
}

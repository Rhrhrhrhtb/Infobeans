//Q8 wap to print prime numbers between 2 to 20
// package Assignment_5;

public class Practice8 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int num = 20;
        // boolean flag = false;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                // flag = true;
                count++;
                // break;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

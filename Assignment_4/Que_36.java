
import java.util.Scanner;

public class Que_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Basic Salary :");
        int bs = input.nextInt();
        float HRA, DA, total;

        if (bs <= 10000) {

            HRA = bs * 0.2f;
            DA = bs * 0.8f;
            total = bs + HRA + DA;
            System.out.println("Gross Salary : " + total);
        } else if (bs <= 20000) {
            HRA = bs * 0.25f;
            DA = bs * 0.9f;
            total = bs + HRA + DA;
            System.out.println("Gross Salary : " + total);
        } else {
            HRA = bs * 0.3f;
            DA = bs * 0.95f;
            total = bs + HRA + DA;
            System.out.println("Gross Salary : " + total);
        }
        // total = bs + HRA + DA;
        // System.out.println("Gross Salary : " + total);

    }
}

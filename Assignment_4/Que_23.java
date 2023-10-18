
import java.util.Scanner;

public class Que_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your Age ");
        int a = sc.nextInt();

        System.out.println("Enter  your Age");
        int b = sc.nextInt();
        System.out.println("Enter  your Age");
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("First person is oldest and Third person is youngest");
            } else {
                System.out.println("First person is oldest and Second person is youngest");
            }
        } else if ((b > c) && (b > a)) {
            if (c > a) {
                System.out.println("Second person is oldest and First person is youngest");
            } else {
                System.out.println("Second person is oldest and Third person is youngest");
            }
        } else {
            if (a > b) {
                System.out.println("Third person is oldest and Second person is youngest");
            } else {
                System.out.println("Third person is oldest and First person is youngest");
            }
        }

    }
}

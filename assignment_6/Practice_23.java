package assignment_6;

public class Practice_23 {

    public static void main(String[] args) {
        char a = 'a';
        for (char i = 'a'; i <= 'e'; i++) {
            for (char j = 'a'; j <= i; j++) {
                if (i == 'e' || j == 'a' || i == j) {
                    System.out.print(a);

                } else {
                    System.out.print(" ");
                }
                a++;
            }

            System.out.println(" ");
        }
    }
}

package assignment_6;
//    *
//   * *
//  * * *
// * * * *
//  * * * * *

public class Practice_57 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                // for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}

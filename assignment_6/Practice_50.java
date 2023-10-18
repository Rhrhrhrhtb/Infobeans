package assignment_6;
//  1234
//   123
//    12
//     1

public class Practice_50 {

    public static void main(String[] args) {
        // rows
        for (int i = 5; i >= 1; i--) {
            // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");

            }
            // print 
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();

        }

    }
}

package assignment_6;

//     A
//    AB
//   A_C
//  A__D
// ABCDE
public class Practice_48 {

    public static void main(String[] args) {
        char a = 'A';
        // rows
        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // print
            for (int k = 1; k <= i; k++) {
                if (i == 5 || k == 1 || k == i) {
                    System.out.print(a);

                } else {
                    System.out.print(" ");
                }
                a++;

            }
            System.out.println();
            a = 'A';
        }

    }
}

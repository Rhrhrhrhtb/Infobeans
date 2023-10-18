package assignment_6;
//     A
//    AB
//   ABC
//  ABCD
// ABCDE

public class Practice_46 {

    public static void main(String[] args) {

        char a = 'A';
        // Rows

        for (int i = 1; i <= 5; i++) {
// space
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;

            }

            System.out.println();
            a = 'A';

        }
    }
}

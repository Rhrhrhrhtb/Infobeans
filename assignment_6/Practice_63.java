package assignment_6;
//       A
//      ABC
//     ABCDE
//    ABCDEEF
//   ABCDEFGHI

public class Practice_63 {

    public static void main(String[] args) {
        char a = 'A';

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(a + " ");
                a++;

            }
            System.out.println();
            a = 'A';

        }

    }

}

package assignment_6;
// ABCDE
//  A__D
//   A_C
//    AB
//     A

public class Practice_54 {

    public static void main(String[] args) {
        char a = 'A';
        int j;
        for (int i = 5; i >= 1; i--) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((i == 4 && k == 2) || (i == 4 && k == 3) || (i == 3 && k == 2)) {
                    System.out.print("_");
                } else {
                    System.out.print(a);

                }
                a++;
                
            }
            System.out.println();
            a = 'A';

        }

    }
}

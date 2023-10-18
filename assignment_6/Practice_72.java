package assignment_6;
//    A B C D E
//     A B C D
//      A B C
//       A B
//        A

public class Practice_72 {

    public static void main(String[] args) {
        char j;
        for (char i = 'E'; i >= 'A'; i--) {
            for ( j = 'A'; j <= 'E'-i; j++) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                System.out.print(k+ " ");
            }
            System.out.println();
        

        }

    }
}

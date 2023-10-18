package assignment_6;

// 11111
//  2222
//   333
//    44
//     5
public class Practice_56 {

    public static void main(String[] args) {
        int j;
        for (int i = 5; i >= 1; i--) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}

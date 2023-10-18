package assignment_6;
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

public class Practice_65 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                if (i == 1 || k == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(" " + (i - k + 1));
                }
            }
            System.out.println();
        }

    }
}

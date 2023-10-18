package assignment_6;

// 55555
//  4__4
//   3_3
//    22
//     1
public class Practice_53 {

    public static void main(String[] args) {
        int j;
        for (int i = 5; i >= 1; i--) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((i == 4 && k == 2) || (i == 4 && k == 3) || (i == 3 && k == 2)) {
                    System.out.print("_");
                } else {
                    System.out.print(i);
                }

            }
            System.out.println();
        }
    }
}

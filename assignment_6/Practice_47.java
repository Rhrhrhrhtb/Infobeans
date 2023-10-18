package assignment_6;
//     1
//    11
//   1*1
//  1**1
// 11111

public class Practice_47 {

    public static void main(String[] args) {
        int j = 1;
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 5 || k == 1 || k == i) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}

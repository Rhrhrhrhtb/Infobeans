package assignment_6;
//        1
//       1*1
//      1***1
//     1*****1
//    111111111

public class Practice_66 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1 || i == 5) {
                    System.out.print(1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}

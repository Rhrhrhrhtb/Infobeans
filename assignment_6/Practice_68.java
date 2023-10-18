package assignment_6;
//        #
//       *#*
//      **#**
//     ***#***
//    ****#****

public class Practice_68 {

    public static void main(String[] args) {
        int j;
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                if (j == 5) {
                    System.out.print("#");
                } else {

                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

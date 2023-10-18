package assignment_6;
// ***** *****
// **** ****
// *** ***
// ** **
// * *
// * *
// ** **
// *** ***
// **** ****
// ***** *****

public class Practice_87 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
            for (int l = 1; l <= 5; l++) {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*");
                }

                System.out.print("  ");
                for (int m = 1; m <= l; m++) {
                    System.out.print("*");
                
            }
                System.out.println();
        }
    }
}


package assignment_6;
// 123456789
//  1     7
//   1   5
//   1  3
//    1

public class Practice_74 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
            

                System.out.print(k);
                
            }

            System.out.println();
        }
    }
    }



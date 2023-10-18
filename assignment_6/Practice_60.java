package assignment_6;
//      X  
//     X X
//    X__X
//   X____X
//  X X X X X

public class Practice_60 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if ((i == 3 && k == 2) || (i == 4 && k == 2) || (i == 4 && k == 3)) {
                    System.out.print("_ ");
                } else {
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }

    }
}

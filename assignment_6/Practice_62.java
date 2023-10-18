package assignment_6;
//       1
//      123
//     12345
//    1234567
//   123456789

public class Practice_62 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print(k + " ");

            }
            System.out.println("");

        }

    }
}

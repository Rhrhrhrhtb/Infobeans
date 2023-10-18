package assignment_6;
// x
// xx
// xxx
// xxxx
// xxx
// xx
// x

public class Practice_76 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
        for (int i = 3; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");

            }
            System.out.println();
        }

    }
}

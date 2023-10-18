
public class Squarepattern {

    public static void main(String[] args) {
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //         if (i == 1 || i == 4 || j == 1 || j == 4) {

        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        int a = 5;
        int x = a;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i + j == a + 1 || j == 1) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            x--;

            System.out.println(" ");
        }
    }
}

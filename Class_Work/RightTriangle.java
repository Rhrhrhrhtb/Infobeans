
public class RightTriangle {

    public static void main(String[] args) {
        // char ch = 'A';

        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

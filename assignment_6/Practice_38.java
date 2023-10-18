package assignment_6;

// 55555
// 4 4
// 3 3
// 22
// 1
public class Practice_38 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == 5 || j == i || j == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

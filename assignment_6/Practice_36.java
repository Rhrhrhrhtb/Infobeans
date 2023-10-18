package assignment_6;
// ABCDE
// A D
// A C
// AB
// A

public class Practice_36 {

    public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                if (i == 'E' || j == i || j == 'A') {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

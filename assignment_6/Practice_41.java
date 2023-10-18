package assignment_6;
// A
// BCD
// EFGHI
// JKLMNOP

public class Practice_41 {

    public static void main(String[] args) {
        char c = 'A';
        int temp = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= temp; j++) {
                System.out.print(c);
                c++;

            }
            temp = temp + i + 1;

            System.out.println();
        }
    }
}

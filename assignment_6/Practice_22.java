package assignment_6;

public class Practice_22 {

    public static void main(String[] args) {
        // char a = 'a';
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                if (i == 'E' || j == 'A' || i == j) {
                    System.out.print(j);

                } else {
                    System.out.print(" ");
                }
                // a++;
            }

            System.out.println(" ");
        }
    }
}

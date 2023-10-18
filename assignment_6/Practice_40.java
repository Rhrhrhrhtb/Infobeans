package assignment_6;

// *
// **
// ****
// *******
// ***********
public class Practice_40 {

    public static void main(String[] args) {
        int temp = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }

            temp = temp + i;
            System.out.println("");
        }
    }
}

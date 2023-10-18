
import java.util.Scanner;

public class Que_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Alphabet ");
        char str = sc.next().charAt(0);
        //  ch = ch.toLowerCase();

        if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U') {
            System.out.println(str + " is vowel");
        } else {
            System.out.println(str + " consonent");
        }
    }
}

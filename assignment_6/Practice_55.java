package assignment_6;
// ABCDE
//  ABCD
//   ABC
//    AB
//     A

public class Practice_55 {

    public static void main(String[] args) {
        char a = 'A';
        int temp = 5;
        int j;
        for (int i = temp; i >= 1; i--) {
            // for(int i =1;i<=5;i++){
            for (j = 1; j <= temp - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(a);
                a++;
                
            }
            System.out.println();
            a = 'A';
        }

    }
}

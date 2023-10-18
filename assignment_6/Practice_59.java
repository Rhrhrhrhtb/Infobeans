package assignment_6;

//      A
//     A B
//    A B C
//   A B C D
//   A B C D E
public class Practice_59 {

    public static void main(String[] args) {
        char a = 'A';
        for (int i = 1; i <= 5; i++) {
for(int j =1;j<=5-i;j++){
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print(a + " ");
            a++;

        }
        System.out.println();
        a = 'A';

    

}
    
}
}

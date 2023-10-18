package assignment_6;
//       1
//      212
//     32123
//    4321234
//   543212345

public class Practice_84 {

    public static void main(String[] args) {
        // int i;
        for(int i=1;i<=5;i++)
     {
       for(int s=5-i;s>=1;s--)
       {
         System.out.print(" ");
       }
   
       for(int j=i;1<=j;j--)
       {
         System.out.print(j);
       }

       for(int k=2;k<=i;k++)
       {
         System.out.print(k);
       }

       System.out.println();
     }
 }

}
    

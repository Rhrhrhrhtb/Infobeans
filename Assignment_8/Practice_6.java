package Assignment_8;
// 6 wap to find and print prime numbers in given array

public class Practice_6 {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int flag = 0;

        int a[] = {3, 12, 13};

        for (i = 0; i < a.length; i++) {
            flag = 0;
            for (j = 2; j < a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    flag = 1;
                    break;
                }
            }
            // System.out.println(a[i]+" - ");
            if (flag == 0) {
                System.out.println("  prime number ");
            } else {
                System.out.println("not prime number ");
            }
        }
    }

}

package Assignment_3_2;

public class que_41 {

    public static void main(String[] args) {

        int chair1 = 2, table1 = 3, total1 = 1300;
        int chair2 = 3, tables2 = 2, total2 = 1200;

        int final1 = chair1 + table1;
        int final2 = chair2 + tables2;
        int final3 = (final2) - (final1);

        int total = (total1) - (total2);

        System.out.println("chair : " + final3 + " total number of chairs are : " + total);
    }
}

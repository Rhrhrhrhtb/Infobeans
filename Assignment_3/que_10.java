package Assignment_3;

public class que_10 {

    public static void main(String[] args) {
        int total_Students = 90;

        int boys = 45;

        double grade_A_Percentage = 50.0;

        double grade_A_Students = (grade_A_Percentage / 100) * total_Students;

        int boys_With_Grade_A = 20;

        int girls_With_Grade_A = (int) (grade_A_Students - boys_With_Grade_A);
        
        System.out.println("Total number of girls getting grade A: " + girls_With_Grade_A);
    }
}

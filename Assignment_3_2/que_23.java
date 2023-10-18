package Assignment_3_2;

public class que_23 {

    public static void main(String[] args) {

        double a = 1, b = 2, c = 3, area1;

        double s = (a + b + c) / 2;

        area1 = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(s);
        System.out.println("area of triangle : " + area1);
    }
}

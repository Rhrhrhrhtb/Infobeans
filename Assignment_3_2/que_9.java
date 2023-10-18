package Assignment_3_2;

public class que_9 {

    public static void main(String[] args) {

        int a = 26, b = 24, c = 10;

        int s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(s);
        System.out.println("area of triangle : " + area);

    }
}

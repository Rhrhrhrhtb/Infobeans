package Assignment_3_2;

public class que_27 {

    public static void main(String[] args) {

        double s1 = 125, s2 = 64, perimeter;

        //  5 times (area_square) = a*a,,, = area of reactangle
        // area of reactangle=l*b
        // perimeter of square =4a
        double area_square = 5 * (s1 * s2);

        double perimeter_square = 4 * Math.sqrt(area_square);
        // System.out.println("area of square :" + area_square);
        System.out.println("perimeter of square : " + perimeter_square);
    }

}

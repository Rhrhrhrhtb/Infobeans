package Assignment_2;

public class que_6 {

    public static void main(String[] args) {

        // Area of triangle =1/2*l*b.perimeter=  a+b+c; s =a+b+c/2
        int side1 = 10;
        int side2 = 9;
        int perimeter = 36;
        // int side3 = (perimeter - (side1 + side2));

        // int s = (side1 + side2 + side3) / 3;
        // double areaOfTriangle = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        // System.out.println(side3);
        // System.out.println(s);
        // System.out.println(areaOfTriangle);
        int area = (side1 * side2) / 2;
        System.out.println(area);
    }
}

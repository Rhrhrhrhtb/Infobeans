package Assignment_3_2;

public class que_24 {

    public static void main(String[] args) {
        // Base² + height² = hypotenuse²
        // Area of triangle = 1/2 × base × height
        double base = 8, hypotenuse = 10, area, heigth;

        heigth = Math.sqrt(hypotenuse * hypotenuse - base * base);

        area = (base * heigth) / 2;
        System.out.println("Height of triangle :" + heigth);
        System.out.println("Area of right triangle : " + area);

    }
}

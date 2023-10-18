package Assignment_3_2;

public class que_18 {

    public static void main(String[] args) {

        // volume of cube =a*a*a,,surface area of cube =6 a*a;
        double volume_cube = 1728, surface_area;
        double sideLength = Math.cbrt(volume_cube);

        surface_area = 6 * Math.pow(sideLength, 2);

        System.out.println("Surface area of cube :" + surface_area);

    }
}

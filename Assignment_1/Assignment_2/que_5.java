package Assignment_2;

import java.util.Scanner;

public class que_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost: ");
        int cost = sc.nextInt();

        System.out.println("Enter the length : ");
        int length = sc.nextInt();

        System.out.println("Enter the rate : ");
        int rate = sc.nextInt();

        // int cost = 1600, length = 20, rate = 25;
        // find area of park =cost/rate
        // area of rect =l*b
        // perimeter =2(l+w)
        float breadth, perimeter, area;

        area = cost / rate;

        breadth = area / length;

        perimeter = 2 * (length + breadth);

        System.out.println(" Area : " + area);
        System.out.println(" breadth : " + breadth);
        System.out.println("perimeter : " + perimeter);

    }
}

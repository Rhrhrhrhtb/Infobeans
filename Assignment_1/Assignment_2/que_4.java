package Assignment_2;

public class que_4 {

    public static void main(String[] args) {

        int length = 300;
        int width = 150;
        int rate = 6;

        int area = length * width;

        int costOfTiles = (rate * area) / 100;

        System.out.println("Area Of plot :" + area);
        System.out.println("Cost Of Tiling : " + costOfTiles);

    }
}

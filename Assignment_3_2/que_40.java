package Assignment_3_2;

public class que_40 {

    public static void main(String[] args) {

        // volume of cube =a*a*a;
        // volume of cube =N*volume of small cube
        int side_cube = 100, side_small_cube = 10, N;

        int volume_cube = side_cube * side_cube * side_cube;

        int volume_small_cube = side_small_cube * side_small_cube * side_small_cube;

        // volume_cube= N*volume_small_cube;
        N = volume_cube / volume_small_cube;

        System.out.println("total small cubes are obtained : " + N);
    }
}
    
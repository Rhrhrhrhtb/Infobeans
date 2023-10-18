package Assignment_3_2;

public class que_8 {

    public static void main(String[] args) {

        double speed = 12.5, time = 30, length_bridge, total_distance, train_length = 130;
        // distance =speed*time
        total_distance = speed * time;
        System.out.println("Total distance : " + total_distance);

        // length of bridge =total distance-length of train;
        length_bridge = total_distance - train_length;
        System.out.println("The length of bridge is : " + length_bridge);

    
    }
}

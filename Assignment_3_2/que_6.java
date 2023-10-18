package Assignment_3_2;

public class que_6 {

    public static void main(String[] args) {

        double lengthOfTrain = 130;
        double time = 30;
        double speedOfTrain = 12.5;

        //  speed =distance/time   d =(s*t)- total length of train
        // 45km/hr = 45*1000/3600 to change m/s = 12.5
        double length_bridge = (speedOfTrain * time) - lengthOfTrain;

        System.out.println(length_bridge);

    }
}

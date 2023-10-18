package Assignment_3_2;

public class que_16 {

    public static void main(String[] args) {
        double buying = 900, seling = 1080, profit, gain_per;

        profit = seling - buying;
        // Profit % = Profit/Cost Price × 100. 

        gain_per = (profit / buying) * 100;

        System.out.println("Gain percentage :" + gain_per);
    }
}

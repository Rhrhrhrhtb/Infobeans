package Assignment_3_2;

public class que_17 {

    public static void main(String[] args) {

        double cost = 1500, sold = 1230, loss, loss_per;
        // loss
        loss = cost - sold;

        // loss per = loss/c.p*100
        loss_per = (loss / cost) * 100;
        System.out.println(loss_per);
    
    }

}

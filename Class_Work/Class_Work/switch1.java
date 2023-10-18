package Class_Work;

public class switch1 {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.length());
        switch (s) {
            case "by":
                System.out.println("by");
                break;
            case "Hello":
                System.out.println("Hello");
                break;
            default:
                System.out.println("by default");
        }
    }
}

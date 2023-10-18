package Assignment_8;
// Q.12 a) Write a statement that declares a string array initialized with the following strings:
// "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
// b) Write a loop that displays the contents of each element in the array that you declared.

public class Practice_12 {

    public static void main(String[] args) {
        String str[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

    }
}

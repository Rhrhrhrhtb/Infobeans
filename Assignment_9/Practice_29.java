package Assignment_9;
// 29. Write a Java program to find the sum of the two elements of a given array
// equal to a given integer.
// Sample array: [1,2,4,5,6]
// Target value: 6.

public class Practice_29 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 6) {
                    System.out.println("Sum of two element : " + arr[i] + "+" + arr[j] + "=" + 6);
                }
            }
        }
    }
}

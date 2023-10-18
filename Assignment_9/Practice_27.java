package Assignment_9;
// 27.Write a Java program to remove duplicate elements from a given array and
// return the updated array length.
// Sample array: [20, 20, 30, 40, 50, 50, 50]
// After removing the duplicate elements the program should return 4 as the new
// length of the array.
// 

public class Practice_27 {

    public static void main(String[] args) {

        int arr[] = {20, 20, 30, 40, 50, 50, 50};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[i + 1];
                }

            }
            
        }
        for (int arr1 :arr) {
            System.out.println("After removing : " + arr1);

        }

    }
}

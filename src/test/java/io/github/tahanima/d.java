public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 2, 4, 8, 1, 6};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element of the array is: " + max);
        System.out.println("Minimum element of the array is: " + min);
    }
}
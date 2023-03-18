import java.util.Arrays;

public class a {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 5, 7, 8, 8};
        int[] dupArr = new int[arr.length];
        int count = 0;

        // Sort the array
        Arrays.sort(arr);

        // Iterate through the array and find duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                // Found a duplicate
                dupArr[count] = arr[i];
                count++;
            }
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < count; i++) {
            System.out.print(dupArr[i] + " ");
        }
    }
    
    public static char[] sortCharArray(char[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

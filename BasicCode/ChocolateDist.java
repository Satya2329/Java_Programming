package BasicCode;
import java.util.Arrays;

public class ChocolateDist {
    public static int findMinDiff(int[] arr, int m) {
        if (m == 0 || arr.length == 0 || m > arr.length) return 0;

        Arrays.sort(arr); // Step 1: Sort the array

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; // Number of students
        System.out.println("Minimum difference: " + findMinDiff(arr, m));
    }
}
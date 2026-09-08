package BasicCode;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 1, 32, 13};

        System.out.println("Max Difference: " + findMaxDifference(numbers));
        System.out.println("Min Difference: " + findMinDifference(numbers)); 
    }

    public static int findMaxDifference(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    public static int findMinDifference(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < sorted.length; i++) {
            minDiff = Math.min(minDiff, sorted[i] - sorted[i - 1]);
        }
        return minDiff;
    }
}

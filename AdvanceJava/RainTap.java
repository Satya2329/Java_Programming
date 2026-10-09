package AdvanceJava;
public class RainTap {
   
    static int trappingWater(int arr[], int n) {
        if (n <= 2) return 0;

        int left = 0;
        int right = n - 1;
        int left_max = 0;
        int right_max = 0;
        int totalWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= left_max) {
                    left_max = arr[left];
                } else {
                    totalWater += left_max - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= right_max) {
                    right_max = arr[right];
                } else {
                    totalWater += right_max - arr[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;

        int result = trappingWater(arr, n);
        System.out.println("Total units of trapped water: " + result);
    }
}
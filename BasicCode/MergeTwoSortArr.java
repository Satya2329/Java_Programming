package BasicCode;

import java.util.Arrays;

public class MergeTwoSortArr {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50, 70};
        int[] arr2 = {20, 40, 60, 80, 90};

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
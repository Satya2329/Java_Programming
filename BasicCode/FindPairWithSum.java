package BasicCode;
import java.util.Arrays;
import java.util.HashSet;

public class FindPairWithSum {

    public static void main(String[] args) {
        int[] numbers = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target Sum: " + target);
        System.out.println("-----------------------------------");

        int[] resultHashSet = findPairHashSet(numbers, target);
        if (resultHashSet.length == 2) {
            System.out.println("HashSet Solution: Found pair (" + resultHashSet[0] + ", " + resultHashSet[1] + ")");
        } else {
            System.out.println("HashSet Solution: No pair found.");
        }
        int[] resultTwoPointer = findPairTwoPointer(numbers, target);
        if (resultTwoPointer.length == 2) {
            System.out.println("Two Pointer Solution: Found pair (" + resultTwoPointer[0] + ", " + resultTwoPointer[1] + ")");
        } else {
            System.out.println("Two Pointer Solution: No pair found.");
        }
    }

    public static int[] findPairHashSet(int[] arr, int target) {
        if (arr == null || arr.length < 2) return new int[]{};

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return new int[]{complement, num};
            }
            seen.add(num);
        }

        return new int[]{};
    }

    
    public static int[] findPairTwoPointer(int[] arr, int target) {
        if (arr == null || arr.length < 2) return new int[]{};

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int left = 0;
        int right = sorted.length - 1;

        while (left < right) {
            int currentSum = sorted[left] + sorted[right];

            if (currentSum == target) {
                return new int[]{sorted[left], sorted[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}
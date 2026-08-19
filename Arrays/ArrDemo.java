package Arrays;
import java.util.Arrays;
public class ArrDemo {
    public static void main(String[] args) {
        
        // 1. DECLARATION & INITIALIZATION
        // Method A: Declare with a fixed size (elements default to 0 for int)
        int[] numbers = new int[5]; 
        
        // Assigning values using indices
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Method B: Declare and initialize inline (compiler auto-determines size)
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // 2. ACCESSING ELEMENTS
        System.out.println("First fruit: " + fruits[0]); // Output: Apple
        
        // 3. FINDING LENGTH
        // Use the '.length' property (not a method)
        System.out.println("Size of numbers array: " + numbers.length); // Output: 5

        // 4. MODIFYING ELEMENTS
        fruits[1] = "Blueberry"; // Replaces "Banana"

        // 5. LOOPING THROUGH ARRAYS
        System.out.println("\n--- Iterating with standard For Loop ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println("\n--- Iterating with Enhanced For Loop (For-Each) ---");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 6. USEFUL UTILITY METHODS (java.util.Arrays)
        int[] unsorted = {5, 1, 9, 3, 7};
        
        // Sorting the array
        Arrays.sort(unsorted); 
        System.out.println("\nSorted array: " + Arrays.toString(unsorted)); // Output: [1, 3, 5, 7, 9]
        
        // Binary search (Requires a sorted array)
        int index = Arrays.binarySearch(unsorted, 7);
        System.out.println("Index of element 7: " + index); // Output: 3
    }
}


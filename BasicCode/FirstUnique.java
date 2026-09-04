package BasicCode;

public class FirstUnique {
    public static int findFirstNonRepeatingIndex(String s) {
        int[] freq = new int[256]; // Extended ASCII size
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int index = findFirstNonRepeatingIndex(input);
        
        if (index != -1) {
            System.out.println("First non-repeating character: " + input.charAt(index) + " at index " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
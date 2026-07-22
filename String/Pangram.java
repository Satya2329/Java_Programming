package String; 

public class Pangram {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = true;

        // Check length first
        if (s.length() < 26) {
            isPangram = false;
        } else {
            // Reassign to convert to lowercase
            s = s.toLowerCase();
            boolean[] mark = new boolean[26];

            // Mark present characters
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    mark[ch - 'a'] = true;
                }
            }
            for (boolean present : mark) {
                if (!present) {
                    isPangram = false;
                    break;
                }
            }
        }

        // Output the result
        if (isPangram) {
            System.out.println("It is a Pangram!");
        } else {
            System.out.println("It is NOT a Pangram!");
        }
    }
}
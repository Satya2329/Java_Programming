package BasicCode;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];
        boolean hasDuplicates = false;

        System.out.println("Duplicate characters:");

        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                String displayChar = (chars[i] == ' ') ? "' ' (space)" : "'" + chars[i] + "'";
                System.out.println(displayChar + " appears " + count + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }

        sc.close();
    }
}
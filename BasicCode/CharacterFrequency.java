package BasicCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char displayChar = entry.getKey();
            if (displayChar == ' ') {
                System.out.println("' ' (space) : " + entry.getValue());
            } else {
                System.out.println("'" + displayChar + "' : " + entry.getValue());
            }
        }

        sc.close();
    }
}
package String;

import java.util.Scanner;

public class Solution {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];

      
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }


        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + areAnagrams(s1, s2));

        String s3 = "allergy";
        String s4 = "allergyy";
        System.out.println("Are \"" + s3 + "\" and \"" + s4 + "\" anagrams? " + areAnagrams(s3, s4));

        String s5 = "listen";
        String s6 = "lists";
        System.out.println("Are \"" + s5 + "\" and \"" + s6 + "\" anagrams? " + areAnagrams(s5, s6));
    }
}
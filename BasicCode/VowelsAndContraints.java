package BasicCode;

import java.util.Scanner;

public class VowelsAndContraints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a string");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int vowels = 0;
        int constraints = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else {
                    constraints++;
                }
            }
        }
        System.out.println("Vowels" + vowels);
        System.out.println("Constraints" + constraints);
        sc.close();
    }
}

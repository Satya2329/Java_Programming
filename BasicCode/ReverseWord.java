package BasicCode;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();

        if(str== null || str.length() <= 1){
            System.out.println(str);
        } else {
            String reveWord = new StringBuilder(str).reverse().toString();
            System.out.println(reveWord);
        }
        sc.close();
    }
}

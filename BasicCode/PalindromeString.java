package BasicCode;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        if(str == null || str.length()<=1){
            System.out.println(str);
        } else {
            String reversed = new StringBuilder(str).reverse().toString();
            //if(reversed == str)  if we yous this approach it compare with the memory address of the String
            if (str.equalsIgnoreCase(reversed)) {// Use equalsIgnoreCase to compare String content, not memory addresses
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        sc.close();
    }
}

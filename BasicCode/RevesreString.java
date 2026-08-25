package BasicCode;
import java.util.Scanner;

public class RevesreString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        if (str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println(reversed);
        }

        sc.close();
    }
}
package BasicCode;
import java.util.Scanner;

public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Invalid Number");
        } else {
            int originnalnum = num;
            int reversenum = 0;
            while (num>0) {
            int rem = num % 10;
            reversenum = (reversenum * 10) + rem;
            num = num/10;
            }

            if(originnalnum == reversenum){
                System.out.println("Number is palindrome");
            } else {
                System.out.println("Number is not Palindrome");
            }
        }  
        sc.close(); 

    }
}

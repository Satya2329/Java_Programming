package BasicCode;
import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter the range");
        int num2 = sc.nextInt();

        for (int j = num; j <= num2; j++) {
            
            if (j < 2) {
                continue; // Skip numbers less than 2
            }
            int count = 0; 

            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    count++; // Factor found
                    break;
                }
            }
            if (count == 0) {
                System.out.println(j + " is a prime number");
            }
        }

        sc.close();
    }
}
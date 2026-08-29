package BasicCode;
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scannerInput());
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private static java.io.InputStream scannerInput() {
        return System.in;
    }
}
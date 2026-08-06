package LoopControl;
import java.util.Scanner;

public class LastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = sc.nextInt();

        num = Math.abs(num);
        while (true) {
            int digit = num % 10;
            System.out.println("The last digit is: " + digit);
            break; // Stops the loop after printing the first (last) digit
        }

        sc.close();
    }
}
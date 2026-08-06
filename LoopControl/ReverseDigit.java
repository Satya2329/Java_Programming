package LoopControl;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        num = Math.abs(num);

        do {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        } while (num > 0);

        sc.close();
    }
}
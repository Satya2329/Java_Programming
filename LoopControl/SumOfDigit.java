package LoopControl;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        int sum =0;
        do {
            int digit = num%10;
            sum+=digit;
            num = num/10;
        } while(num>0);
        System.out.println(sum);
        sc.close();
    }
}

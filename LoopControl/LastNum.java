package LoopControl;
import java.util.Scanner;
public class LastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = sc.nextInt();

        while(num > 0){
            int digit = num%10;
            System.out.println(digit);
            num = num/10;
        }
        sc.close();
    }
}

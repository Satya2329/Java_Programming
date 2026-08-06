package LoopControl;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        do{
            int digit = num%10;
            if(num<0){
             System.out.println(-1*digit);      
            } else {
                System.out.println(digit);
            }
           
            break;
        } while(num>0);
        sc.close();
    }
}

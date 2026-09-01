package BasicCode;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp =0;
        if(num<0){
            num = -num;
        }

        while(num>0){
            int lastnum = num % 10;
            temp = temp + lastnum;
            num = num /10;
        }
        System.out.println(temp);
        sc.close();
    }
  
}

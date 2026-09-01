package BasicCode;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num  = sc.nextInt();

        if(num < 0){
            num = -num;
        }
        int count =0;
        if(num == 0){
            count = 1;
        }else{
            while(num >0){
            num = num/10;
            count++;
        }
        }
        System.out.println( count);
        sc.close();
    
    }
}

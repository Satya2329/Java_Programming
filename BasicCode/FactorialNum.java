package BasicCode;

import java.util.Scanner;
public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int fact = 1;

        while(num > 0){
            fact = fact * num;
            num--;
        }
        System.out.println("Factorila of the num is " + fact);
        sc.close();
    }
}

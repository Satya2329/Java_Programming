package BasicCode;

import java.util.Scanner;

public class GcdOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = sc.nextInt();
        System.out.println("ENter the number 2nd number");
        int num2 = sc.nextInt();

        while(num2 != 0){
            int temp = num2;
            num2 = num1 %num2;
            num1 = temp;
        }
        System.out.println(num1);
        sc.close();
    }
}

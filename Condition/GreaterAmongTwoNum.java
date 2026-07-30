package Condition;
import java.util.Scanner;
public class GreaterAmongTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
        sc.close();
    }
}

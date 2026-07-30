package Condition;
import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        } else if(a<0){
            System.out.println("Negative");
        } else if(a==0){
            System.out.println("Zero");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}

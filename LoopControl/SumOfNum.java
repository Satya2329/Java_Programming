package LoopControl;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        int s = 0;

    while(num <= 10){
        s = s + num;
        num++;
    }
    System.out.println(s);
    sc.close();
    }
}

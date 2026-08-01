package LoopControl;
import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int no = sc.nextInt();
        while(no < 200){
            System.out.println(no);
            no++;
        }
        sc.close();
    }
}

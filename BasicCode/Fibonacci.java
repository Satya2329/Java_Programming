package BasicCode;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        int start = 0;
        int end =1;
         System.out.println("Fibonacci Series till" + num + "terms" );

        for(int i=0; i<=num; ++i){
            System.out.println(start + " ");
            int nt = start + end;
            start = end;
            end = nt;
        }
        sc.close();
       
    }
}
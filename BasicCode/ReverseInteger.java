package BasicCode;
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num<=0){
            
            System.out.println("Invalid Number");
        }else {
            int ReverseInteger =0;
            while(num>0){
                int rem = num%10;
                ReverseInteger = (ReverseInteger*10)+rem;
                num = num/10;
            }
        System.out.println(ReverseInteger);
        }
        sc.close();
    }
}

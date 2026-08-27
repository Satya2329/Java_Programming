package BasicCode;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num<2){
            System.out.println("Not a prime number");
        }
            for(int i=3; i*i<=(num); i+=2){
                if(num % i == 0){
                    System.out.println("Not a prime number");
                }
            }
        System.out.println("Number is a prime number");
        sc.close();
    }
}

package BasicProgram;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometer");
        double kilo = sc.nextDouble();
         double miles = kilo * 0.621371;
        
        System.out.printf("%.2f Kilometers is equal to %.2f Miles.\n", kilo, miles);
        
        sc.close();
    }
    
}

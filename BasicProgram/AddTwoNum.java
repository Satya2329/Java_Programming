package BasicProgram;
import java.util.Scanner;
public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("THe sum of the two number is " + sum);
        sc.close();
    }
    
}

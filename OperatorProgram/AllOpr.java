package OperatorProgram;
import java.util.Scanner;
public class AllOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("Operator Menu");
            System.out.println("1. Addition(+)");
            System.out.println("2. Substraction(-)");
            System.out.println("3. Multuplixation(*)");
            System.out.println("4. Division(/)");
            System.out.println("5. Modulous(%)");
            System.out.println("Enter your choice(1-5):");
                choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the first num1");
                    double num1 = sc.nextDouble();
                    System.out.println("Enter the second num2");
                    double num2 = sc.nextDouble();
                    System.out.println("num1 + num2 =" + (num1 + num2));
                    break;

                    case 2:
                         System.out.println("Enter the first num1");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second num2");
                    num2 = sc.nextDouble();
                    System.out.println("num1 + num2 =" + (num1 - num2));
                    break;
                    
                    case 3:
                         System.out.println("Enter the first num1");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second num2");
                    num2 = sc.nextDouble();
                    System.out.println("num1 + num2 =" + (num1 * num2));
                    break;

                    case 4:
                         System.out.println("Enter the first num1");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second num2");
                    num2 = sc.nextDouble();
                    System.out.println("num1 + num2 =" + (num1 / num2));
                    break;
                    
                    case 5:
                         System.out.println("Enter the first num1");
                    num1 = sc.nextDouble();
                    System.out.println("Enter the second num2");
                    num2 = sc.nextDouble();
                    System.out.println("num1 + num2 =" + (num1 % num2));
                    break;

                    default:
                        System.out.println("Entered Invalid choice");
            }
        } while(choice !=5);
        sc.close();
    }
    
}

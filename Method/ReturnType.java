package Method;
import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = valueFunction(5);
        System.out.println(result);
        sc.close();
    }
    public static int valueFunction(int n){
        return (2*n);
    }
    
    }


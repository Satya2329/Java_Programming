package Arrays;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Entrt" + size + "integers");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        sc.close();

    }
}

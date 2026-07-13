package BasicProgram;
import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Taking input from the user:");
    String str = sc.nextLine();
    System.out.println(str);
    sc.close();
    }
}

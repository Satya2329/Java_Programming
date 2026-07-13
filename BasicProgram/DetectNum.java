package BasicProgram;
import java.util.Scanner;
public class DetectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        System.out.println(sc.hasNext());
        sc.close();

    }
}

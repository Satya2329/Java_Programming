package BasicProgram;
import java.util.Scanner;
public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter mark of sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter  mark of sub2");
        int sub2 = sc.nextInt();

        int gpa = (sub1 + sub2)/20;

        System.out.println("The gpa is" + " " + gpa);
        sc.close();

    }
}

package String;
import java.util.Scanner;
public class Alphabets {
    public static void Alphabet(char c1 , char c2){
        for(char ch = c1; ch <= c2; ch++){
            System.out.print(ch + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alphabet('a', 'z');
        sc.close();

    }
}

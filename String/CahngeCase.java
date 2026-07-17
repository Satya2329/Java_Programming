package String;

public class CahngeCase {
    public static void main(String[] args) {
        String s = new String("hello");
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(result);
        System.out.println(s.toUpperCase());

    }
}

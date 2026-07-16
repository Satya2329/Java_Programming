package String;

public class Slcie {
    public static void main(String[] args) {
        String result = sclicString("Hello"); 
        System.out.println(result); 
    }

    public static String sclicString(String s) {
        // Fixed Logic: Slice ONLY if length is greater than 2
        if (s != null && s.length() > 2) {
            return s.substring(1, s.length() - 1);
        } else {
            return "";
        }
    }
}
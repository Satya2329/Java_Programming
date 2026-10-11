package String;

public class RevandCOncat {

    public static String conRever(String s1, String s2) {

        return new StringBuilder(s1 + s2).reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String result = conRever(s1, s2);
        System.out.println(result); 
    }
}
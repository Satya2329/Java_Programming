package String;

public class Equal {
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = new String("Geeks");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

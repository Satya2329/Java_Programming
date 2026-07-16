package String;

public class WordLength {
    public static void main(String[] args) {
        String st = "Satya priya is a good boy";
        String[] word = st.trim().split("\\s+");
        System.out.println(word.length);
    }
}

package AdvanceJava;
import java.util.Arrays;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,15,25,16);
        al.forEach(System.out::println);
    }
}

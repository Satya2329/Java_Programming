package AdvanceJava;
import java.math.BigInteger;
public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("15");
        BigInteger B = new BigInteger("3");
        BigInteger C = A.divide(B);

        System.out.println(C);

    }
}
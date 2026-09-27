package AdvanceJava;
import java.math.BigInteger;

public class FibonacciBigInteger {


    public static BigInteger findNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index n cannot be negative.");
        }
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;  

        for (int i = 2; i <= n; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Fibonacci (" + n + ") = " + findNthFibonacci(n));
    }
}

package AdvanceJava;

import java.math.BigInteger;

public class MultiplyOfBigInteger {
    public static BigInteger mul(BigInteger a, BigInteger b){
        return a.multiply(b);
    }

    public static void main(String[] args) {
        BigInteger num1 = BigInteger.valueOf(10);
        BigInteger num2 = BigInteger.valueOf(20);

        BigInteger mul = mul(num1, num2);
        System.out.println("Mul" + " " + mul);
    }
}

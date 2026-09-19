package AdvanceJava;

import java.math.BigInteger;

public class ModulousOfBigInteger {
    public static BigInteger mod(BigInteger a , BigInteger b){
        return b.mod(a);
    }
    public static void main(String[] args) {
        BigInteger num1 = BigInteger.valueOf(10);
        BigInteger num2 = BigInteger.valueOf(20);

        BigInteger mod = mod(num1, num2);

        System.out.println("mod" + " " + mod);
    }
}

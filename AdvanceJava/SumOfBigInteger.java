package AdvanceJava;
import java.math.BigInteger;
public class SumOfBigInteger {
    public static BigInteger add(BigInteger a , BigInteger b){
        return a.add(b);
    }
    public static void main(String[] args) {
       BigInteger n1 = BigInteger.valueOf(10);
       BigInteger n2 = BigInteger.valueOf(20);
       
       BigInteger sum = add(n1, n2);
       System.out.println("sum" + " " + sum);
    }
}

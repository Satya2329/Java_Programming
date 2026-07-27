package Method;

public class FirstNum {
    public static int firstDigit(int n){
        while(n>=10){
            n = n/10;
        }
        return n;
    }
    public static void main(String[] args) {
        int res = firstDigit(111);
        System.out.println(res);
    }
}

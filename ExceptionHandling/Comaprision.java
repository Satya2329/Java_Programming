package ExceptionHandling;
public class Comaprision {
    public int findmin(int a, int b){
        int add = a+b;
        int mul = a*b;
        int sub = a-b;

        int min = Math.min(add, Math.min(mul,sub));

        try {
            int div = a/b;
            min = Math.min(min,div);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divisible by zero");
        }
        return min;
    }
    public static void main(String[] args) {
        Comaprision cr = new Comaprision();
        int r1 = cr.findmin(5, -5);
        System.out.println("Result" + r1);

        int r2 = cr.findmin(5, 0);
        System.out.println("Result 2" + r2);
    }
}

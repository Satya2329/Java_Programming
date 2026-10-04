package ExceptionHandling;

public class BasicException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a /b;
            System.out.println("Result" + result);
        } catch (ArithmeticException e) {
            System.out.println("A number can't be divisible by zero" + e.getMessage());
        }
        finally{
            System.out.println("Execute completely");
        }
    }
}

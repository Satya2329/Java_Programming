package AdvanceJava;

@FunctionalInterface
interface Hello {
    void sayHello();
}

public class LambdaExpr {
    public static Hello helloFunction(){
        return () -> System.out.println("Hello");
    }
    public static void main(String[] args) {
        Hello h = helloFunction();
        h.sayHello();
    }
}

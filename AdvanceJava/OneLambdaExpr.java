package AdvanceJava;
@FunctionalInterface
interface Multiply {
    int multiplyBy5(int n);
}

class OneLambdaExpr {

    public static Multiply helperFunction() {
        // Lambda implementation of multiplyBy5(int n)
        return n -> n * 5;
    }

    public static void main(String[] args) {
        Multiply m = helperFunction();
        int result = m.multiplyBy5(7);
        System.out.println("Result: " + result);
    }
}

package Method;

public class WithArgument {
    public  int addFUnction(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        WithArgument obj = new WithArgument();
        //obj.addFUnction(5, 3);
        System.out.println(obj.addFUnction(5, 3));
    }
}

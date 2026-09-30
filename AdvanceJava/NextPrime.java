package AdvanceJava;

public class NextPrime {
    public static int nextPrime(int n){
        int next = n+1;
        while(!isPrime(next)){
            next++;
        }
        return next;
    }
    public static boolean isPrime(int n){
        if(n<1) return false;
        if(n == 2) return true;
        if(n%2== 0) return false;

        for(int i =3; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 14;
        System.out.println(number + " " +  nextPrime(number));
    }
}

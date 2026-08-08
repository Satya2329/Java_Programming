package LoopControl;

import java.util.Scanner;

public class OddNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the num");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

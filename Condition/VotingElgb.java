package Condition;

import java.util.Scanner;

public class VotingElgb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Kid");
        } else if(age >= 18){
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}

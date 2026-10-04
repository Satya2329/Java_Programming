package ExceptionHandling;

public class VoteChecker {
  
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        }
        System.out.println("Eligible to vote!");
    }
     public static void main(String[] args) {
        try {
            System.out.println("Testing age 20:");
            checkAge(20); 
            
            System.out.println("\nTesting age 16:");
 
            checkAge(16); 
            
        } catch (IllegalArgumentException e) {
  
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

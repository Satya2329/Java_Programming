package Condition;
public class Logical {

    public static void main(String[] args) {
        boolean userIsActive = true;
        boolean hasMadeCommits = false;
        boolean isWeekend = true;

        System.out.println("--- LOGICAL OPERATORS DEMO ---\n");
     
        System.out.println("--- AND Operator (&&) ---");
        if (userIsActive && hasMadeCommits) {
            System.out.println("Result: Streak is safe! (Both conditions are true)");
        } else {
            System.out.println("Result: Streak lost. (At least one condition is false)");
        }

        System.out.println("\n--- OR Operator (||) ---");
        if (hasMadeCommits || isWeekend) {
            System.out.println("Result: Streak is safe! (Either committed or it is the weekend)");
        } else {
            System.out.println("Result: Streak lost. (Both conditions are false)");
        }

        System.out.println("\n--- NOT Operator (!) ---");
        System.out.println("Original value of userIsActive: " + userIsActive);
        System.out.println("Inverted value (!userIsActive): " + !userIsActive);
    }
}


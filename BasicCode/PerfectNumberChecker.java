package BasicCode;

public class PerfectNumberChecker {

    public static boolean isPerfectNumber(long num) {
        // Perfect numbers must be greater than 1
        if (num <= 1) {
            return false;
        }

        // 1 is always a proper divisor for any number > 1
        long sum = 1; 

        // Find divisors up to the square root of num
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor
                
                // If divisors are not equal (e.g., not a perfect square like 4x4=16),
                // add the corresponding paired divisor (num / i)
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }

        // If the sum of proper divisors equals the original number, it's perfect
        return sum == num;
    }

    public static void main(String[] args) {
        long testNumber = 28;

        if (isPerfectNumber(testNumber)) {
            System.out.println(testNumber + " is a perfect number.");
        } else {
            System.out.println(testNumber + " is NOT a perfect number.");
        }
    }
}


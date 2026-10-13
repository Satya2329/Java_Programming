package Condition;

public class AllOper {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int x = a++; 
        int y = --b; 
        

        int sum = x + y;            
        int diff = a - b;           
        int product = sum * 2;      
        int quotient = product / 3; 
        int remainder = quotient % 4; 
        
  
        int bitwiseAnd = remainder & 1;  
        int bitwiseOr = bitwiseAnd | 4;  
        int bitwiseXor = bitwiseOr ^ 2;  
        int bitwiseComplement = ~bitwiseXor; 
        
        int shiftLeft = 1 << 2;        
        int shiftRight = b >> 1;       
        int unsignedShiftRight = -8 >>> 29; 
      
        boolean isGreater = x > y;
        boolean isEqual = (a == 11);
        boolean isNotEqual = (b != 4);
    
        boolean condition1 = (x < y) && ((a++) > b); 
        boolean condition2 = (x > y) || ((b--) < 0); 
        boolean finalLogical = !condition1 && condition2;
  
        String text = "Java";
        boolean isString = text instanceof String;
     
        int score = (finalLogical && isString && isEqual) ? 100 : 0;
   
        score += 5;  
        score -= 2;  
        score *= 2;  
        score /= 3;  
        score %= 10; 
        
        System.out.println("Final Score: " + score);
        System.out.println("Value of 'a': " + a);
        System.out.println("Value of 'b': " + b);
    }
}


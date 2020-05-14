
/**
 * Write a description of class TwosComp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwosComp
{
    /**
     * Method Devised in Class, 
     * using both flipBits and addOne methods
     */
    static String showBits(int num, int bitLength) {
        String result = "";
        
        int quotient = 0;
        int remainder = 0;
        boolean negative = (num < 0);
        
        if (negative) {
            num = -num;
        }
        
        int divident = num;
        
        while (divident !=0){
            quotient = divident / 2;
            remainder = divident % 2;
            result = remainder + result;
            divident = quotient;
        }
        
        int zeros = bitLength - result.length();
        
        for (int i = 0; i < zeros; i += 1){
            result = "0" + result;
        }
        
        if (negative) {
            result = addOne(flipBits(result));
        }
            
        return result;
    }
    
    /**
     * Method derived from original, using only the flipBits method in tandem.
     * We would likely be able to use a bit array to compile the entire program
     * into this method, but I should use my other time to finish chapter 12.
     */
    static String simplerShowBits(int num, int bitLength) {
        String result = "";
        int quotient = 0;
        int remainder = 0;
        boolean negative = (num < 0);
        
        if (negative){
            num = ~num;
        }
        
        int divident = num;
        
        while (divident !=0){
            quotient = divident / 2;
            remainder = divident % 2;
            result = remainder + result;
            divident = quotient;
        }
                
        int zeros = bitLength - result.length();
        
        for (int i = 0; i < zeros; i += 1){
                result = "0" + result;            
        }
        
        if(negative){
            result = flipBits(result);
        }
        
        return result;
    }
    
    private static String flipBits(String s){
        String result = "";
        for (String ch : s.split("")){
            
            if(ch.equals("1")){
                result = result + "0";
            }
            else{
                result = result + "1";
            }
        }
        
        return result;
    }
    
    private static String addOne(String binaryString) {
        String result = "";
        char[] chars = binaryString.toCharArray();
        boolean carry = true;

        for(int i = chars.length -1; i >= 0; i--) {
            char c = chars[i];
            
            if(c == '1' && carry) {
                result = "0" + result;
            } else if (carry) {
                carry = false;
                result = "1" + result;
            } else {
                result = c + result;
            }

        }
        return result;
    }
}

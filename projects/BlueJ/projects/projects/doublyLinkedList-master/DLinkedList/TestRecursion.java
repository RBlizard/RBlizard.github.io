
/**
 * Write a description of class TestRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestRecursion
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class TestRecursion
     */
    public TestRecursion()
    {
        int value = 14;
        System.out.println(value + ": " + convertToBinStr(value));
    }
    
    public static String convertToBinStr(int number){
        String result = "";
        int rem = number % 2;
        int quot = number / 2;
        
        if (quot == 0){
            result = "" + rem; // no recursion
        }
        else{
            result = convertToBinStr(quot) + "" + rem; //recursion
        }
        
        return result;
    }
}

import java.util.ArrayList;

/**
 *  Final Exam 2020
 *  @author <Student Name>
 *  
 *  This class holds numbers in an int array.
 *  Add any necessary fields
 *  Add the following methods to this class
 * 
*** Provide a default constructor that creates 100 random numbers.
 *  The random numbers should be in the range from 1..1000, inclusive.
 *  Use the Random class to generate the random numbers. Usa an array [ ].
 * 
*** Provide a constructor that has a single int parameter. This parameter
 *  specifies how many random numbers should be created and stored inside
 *  the class. Use an array, [ ], to store the numbers.
 * 
*** Provide a method that returns the average of the numbers, a double.
 *  Loop to find the sum of the numbers and then divide by the count of numbers.
 * 
*** Provide a method that returns the number of occurences of a given value.
 *  (For example, pass in a 67 and return how many 67s occur)
 *     
*** Provide a toString() method that simply returns the values with a comma separator.
 *  Use a StringBuilder:  (Or the Arrays class toString() method.)
 *    
 *    For example:
 *       StringBuilder out = new StringBuilder();
 *       
 *       Loop over the array....
 *            out.append( eachNumber + ",");
 *            
 *       return out.toString();
 *     
*** Provide a method that returns the intersection of two Numbers objects, the 
 *  method should have another Numbers object as its only parameter.
 *    For example: Pass in numbersB, [11,3,5,9,13,23], to
 *       numbersA, [21,3,6,13,18,29], and the result returned
 *       is an ArrayList that contains [3,13].
 *    
 *    Usage example:
 *    
 *    Numbers a = new Numbers();
 *    Numbers b = new Numbers();
 *    System.out.println( "Intersection of a and b is: " + a.intersection(b) );
 *    
 *    Note: within the Numbers class you have access to the private fields of
 *       all objects of the Numbers class, so just loop over the 'this' array
 *       asking if each number exists in the other object. Use your occurences
 *       method and look for > 0 to see if a number exists.
 *                
*** Provide a main() method that demonstrates calling ALL the public methods of
 *     your Numbers class. Use code similar to the example just above. Create a
 *     Numbers object and call the methods using the object created.
 *     
 *     Enter your code below.
 */

public class Numbers
{
    // Add student code here
    
    
    public static void main(String[] args) {
        System.out.println("Code by Your Name Here");
        // Create a Numbers object, call your public methods
        
    }
}

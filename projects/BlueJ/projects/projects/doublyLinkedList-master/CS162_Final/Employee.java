
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee implements IEmployee, Comparable
{
    // instance variables
    String firstName;
    String lastName;
    double pay;
    String TYPE;
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String first, String last)
    {
        // initialise instance variables
        firstName = first;
        lastName = last;
        if((first == null) || (last == null)){
            System.out.println("Please enter a valid name, greater than three characters.");
        } else if (first.length() < 3 || last.length() < 3){
            System.out.println("Please enter a valid name, greater than three characters.");
        }
    }

    
    public String getName(){
        return null;
    }
    
    
    public double getPay()
    {
        // put your code here
        return pay;
    }
    
    public String getType(){
        return TYPE;
    }
    
    public int compareTo(Object o){
        int result;
        Employee e = (Employee)o;
        if(((firstName + lastName).compareTo(e.firstName + e.lastName)) > 0 ){
            result = 1;
        } else if (((firstName + lastName).compareTo(e.firstName + e.lastName)) < 0 ){
            result = -1;
        } else {
            result = 0;
        }
        
        return result;
    }
    
    public String toString(){
        return firstName + " " + lastName + ". Pay: " + getPay() +"\n";
    }
}

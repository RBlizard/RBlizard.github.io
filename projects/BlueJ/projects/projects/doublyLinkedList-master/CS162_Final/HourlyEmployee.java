
/**
 * Write a description of class HourlyEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HourlyEmployee extends Employee
{
    // instance variables - replace the example below with your own
    private double hours;
    private double wage;
    /**
     * Constructor for objects of class HourlyEmployee
     */
    public HourlyEmployee(String first, String last, double hours, double wage)
    {
        // initialise instance variables
        super(first, last);
        this.hours = hours;
        this.wage = wage;
        pay = hours * wage;
        TYPE = "Hourly";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void updatePay()
    {
        // put your code here
        pay = pay + (hours * wage);
    }
    
    public void incrementHours(double hours){
        this.hours = hours;
    }
    
    public void changeWage(double wage){
        this.wage = wage;
    }
}

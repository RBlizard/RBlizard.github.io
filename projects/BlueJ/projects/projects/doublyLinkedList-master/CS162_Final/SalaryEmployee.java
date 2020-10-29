
/**
 * Write a description of class SalaryEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SalaryEmployee extends Employee
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class SalaryEmployee
     */
    public SalaryEmployee(String first, String last, double salary)
    {
        // initialise instance variables
        super(first, last);
        pay = salary;
        TYPE = "Salary";
    }
    
    public void changeSalary(double salary){
        pay = salary;
    }
}

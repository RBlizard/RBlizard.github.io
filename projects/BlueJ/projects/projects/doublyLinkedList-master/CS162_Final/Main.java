import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalaryEmployee("Bo","Jones",2000.0));
        employees.add(new SalaryEmployee("Bill","Jones",2000.0));
        employees.add(new HourlyEmployee("Jane","Hill",120,20.0));
        employees.add(new HourlyEmployee("Arty","Jacobs",120,22.0));
        System.out.println(employees);
        employees.sort(null);
        System.out.println(employees);
        System.out.println(employees.stream()
                 .filter(s ->
                 "Hourly".equals(s.getType()))
                 .mapToDouble(s -> s.getPay())
                 .reduce(0, (total, pay) -> total + pay));

    }
}

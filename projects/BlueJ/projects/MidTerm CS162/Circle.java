
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        // initialise instance variables
        super(radius, 1);
        area = radius * radius * Math.PI;
        perimiter = 2 * Math.PI * radius;
        type = "Circle";
    }
    
    public double getRadius(){
        return height;
    }
}

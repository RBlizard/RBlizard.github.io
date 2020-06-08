
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int height, int width)
    {
        super(height, width);
        area = width * height;
        perimiter = (2 * width) + (2 * height);
        type = "Rectangle";
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
}

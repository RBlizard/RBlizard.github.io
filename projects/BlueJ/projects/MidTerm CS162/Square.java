
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Square
     */
    public Square(int width)
    {
        // initialise instance variables
        super(width, width);
        perimiter = 4 * width;
        type = "Square";
    }
}

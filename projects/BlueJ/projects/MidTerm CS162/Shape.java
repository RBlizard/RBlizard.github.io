import java.util.*;
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape implements Drawable, Comparable
{
    // instance variables - replace the example below with your own
    double height;
    double width;
    double area;
    double perimiter;
    String type = "Shape";
    /**
     * Constructor for objects of class Shape
     */
    public Shape(double h, double w)
    {
        // initialise instance variables
        height = h;
        width = w;
        draw();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void draw(){
        System.out.println("Drawing...");
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimiter(){
        return perimiter;
    }
    
    @Override
    public int compareTo(Object shape){
        int result;
        Shape s = (Shape)shape;
        if ( (area - s.getArea()) > 0){
            result = 1;
        } else if( ( area - s.getArea()) < 0){
            result = -1;
        } else { 
            result = 0; 
        }
        return result;
    }
    
    public static final Comparator<Shape>
        perimeterSort = new Comparator<>() {
          @Override
          public int compare(Shape a, Shape b) {         
            double result = a.perimiter - b.perimiter;
    
            if (result == 0) {
              result = a.compareTo(b);
            }
            
            if ( result > 0){
                result = 1;
            } else if( result < 0){
                result = -1;
            } else { 
                result = 0; 
            }
    
            return (int)result;   
          }
        };
    
    public String getType(){
        return type;
    }
    
    public String toString(){
        return type + ": "
               + "Perimeter: " + getPerimiter() + ", "
               + "Area: " + getArea();
    }
}

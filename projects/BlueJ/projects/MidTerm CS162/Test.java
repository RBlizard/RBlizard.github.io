import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author Ryan Blizard
 * @version 1.05.14.2020
 * 
 * Converting -15 base 10 to two's compliment:
 * 
 * Divide 15 by two and record the remainder in the lowest bit location. (this should give you 1)
 * Divide the result by two and record the remainder in the next bit location. (this should give you 11)
 * Repeat until the dividend is 0. (this should give you 1111)
 * Fill the remaining bit locations with 0's.(this should give you 00001111)
 * Flip the bits, and add one. (This should give you 11110001, or -15 in two's comp)
 * 
 */
public class Test
{
    // instance variables - replace the example below with your own
    static ArrayList<Shape> shapes = new ArrayList<>();
    public static void main(String[] args){
        //Shape r = new Rectangle(3,4);
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2,8));
        shapes.add(new Square(4));
        
        for(Shape s : shapes){
            System.out.println(s);
        }
        
        System.out.println("\nSorting...");
        Collections.sort(shapes, Shape.perimeterSort);
        shapes.stream()
                .forEach(s ->
        System.out.println(s));
        
        System.out.println("\nFiltering...");
        printShapes("Square");
    }
    
    private static void printShapes(String shape){
        shapes.stream()
                .filter(s -> shape.equals(s.getType()))
                .forEach(s ->
        System.out.println(s));
    }
}

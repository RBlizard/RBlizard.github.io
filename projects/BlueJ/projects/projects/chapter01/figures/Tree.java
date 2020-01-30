
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaves;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        // initialise instance variables
        trunk = new Square();
        leaves = new Triangle();
    }

    public void draw()
    {
        trunk.changeColor("red");
        trunk.makeVisible();
        trunk.moveHorizontal(-130);
        trunk.moveVertical(80);
        leaves.changeColor("green");
        leaves.changeSize(200, 100);
        leaves.moveVertical(-140);
        leaves.makeVisible();
        
    }
}


/**
 * Write a description of class SwitchDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchDemo
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(int number){
        int mod10 = 10;
        switch (number){
            case 0:  mod10 = 10;
            break;
            case 1:  mod10 = 9;
            break;
            case 2:  mod10 = 8;
            break;
            case 3:  mod10 = 7;
            break;
            case 4:  mod10 = 6;
            break;
            case 5:  mod10 = 5;
            break;
            case 6:  mod10 = 4;
            break;
            case 7:  mod10 = 3;
            break;
            case 8:  mod10 = 2;
            break;
            case 9:  mod10 = 1;
            break;
            case 10: mod10 = 0;
            break;
            default: System.out.println("Please enter a number from 1-10");
        }
        System.out.println("Mod10 = " + mod10);        
    }
}

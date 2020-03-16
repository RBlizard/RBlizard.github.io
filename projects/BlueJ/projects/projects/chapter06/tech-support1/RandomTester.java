import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    final Random randomizer = new Random();
    
    public void printOneRandom(){
        System.out.println(randomizer.nextInt());
    }
    
    public void printMultiRandom(int howMany){
        for(int i = 0; i < howMany; i++){
            System.out.print(randomizer.nextInt() + " ");
        }
    }
    
    public int throwDie(){
        return randomizer.nextInt(6) + 1;
    }
    
    public String getResponse(){
        int number = randomizer.nextInt();
        String string = "Maybe";
        switch (number % 3){
            case 0: string = "Yes";
            break;
            case 1: string = "No";
            break;
            case 2: string = "Maybe";
            break;
        }
        return string;
    }
    
}

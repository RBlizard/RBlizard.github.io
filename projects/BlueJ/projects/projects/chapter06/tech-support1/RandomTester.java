import java.util.Random;
import java.util.ArrayList;
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
    int randomNumber;
    
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
        
        String string = "Maybe";
        ArrayList<String> responses = new ArrayList<>();
        System.out.println(minMax(0, responses.size()));
        return string;
    }
    
    public int maxRandom(int max){
        randomNumber = randomizer.nextInt(max) + 1;
        return randomNumber;
    }
    
    public int minMax(int min, int max){
        randomNumber = randomizer.nextInt(max-min) + min;
        return  randomNumber;  
    }
}

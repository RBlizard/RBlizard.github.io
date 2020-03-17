import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap map = new HashMap();
    
    
    public void enterNumber(String name, String number){
        map.put(name, number);
    }
    
    public String lookupNumber(String name){
        return map.get(name).toString();
    }
}

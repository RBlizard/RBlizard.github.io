import java.util.*;
/**
 * Write a description of class TransporterRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransporterRoom extends Room
{
    // instance variables - replace the example below with your own
    private Random rooms = new Random();
    public TransporterRoom(String description){
        super(description);
    }
    
    public Room getExit(String direction){
        return findRandomRoom();
    }
    
    private Room findRandomRoom(){
        String randomRoom = null;
        ArrayList<String> exitSet = new ArrayList<>();
        Iterator<String> i = exits.keySet().iterator();
        if(i.hasNext()){
            exitSet.add(i.next());
        }
        randomRoom = exitSet.get(rooms.nextInt(exitSet.size()));
        return exits.get(randomRoom);
    }

}

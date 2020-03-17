
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> defaultResponses;
    private HashMap<String, String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new HashMap<>();
        defaultResponses = new ArrayList<>();
        fillResponses();
        fillDefaultResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        String response = "";
        for (String word : words){
            String responseCheck = responses.get(word);
            if(responseCheck != null){
                response += responseCheck + "\n";
            }
        }
        if(response.equals("")){
            int index = randomGenerator.nextInt(defaultResponses.size());
            return defaultResponses.get(index);
        }
        return response;
    }
    
    public void fillResponses(){
        responses.put("slow",
                      "I think this has to do with your hardware. Upgrading\n"+
                      "your processor should solve all performance problems.\n"+
                      "Have you got a problem with our software?");
        responses.put("bug",
                      "Well, you know, all software has some bugs. But our\n"+
                      "software engineers are working very hard to fix them.\n"+
                      "Can you describe the problem a bit further?");
        responses.put("expensive",
                      "The cost of our product is quite competitive. Have you\n"+
                      "looked around and really compared our features?");
    }
    
    public void fillDefaultResponses(){
        defaultResponses.add("That sounds odd. Could you describe this in more detail?");
        defaultResponses.add("No other customer has ever complained about this \n"
        +"before. What is your system configuration?");
        defaultResponses.add("I need a bit more information on that.");
        defaultResponses.add("Have you checked that you do not have a dll conflict?");
        defaultResponses.add("That is covered in the manual. Have you read the manual?");
        defaultResponses.add("Your description is a bit wishy-washy. Have you got \n"
        + "an expert there with you who could describe this better?");
        defaultResponses.add("That's not a bug, that's a feature!");
        defaultResponses.add("Could you elaborate on that?");
        defaultResponses.add("Have you tried running the app on your phone?");
        defaultResponses.add("I just checked StackOverflow - they don't know either.");
    }
}

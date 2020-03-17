/**
 * Final Exam Winter 2020
 * @author <Student Name Here> 
 * 
 * Write code to work with the Word class
 */
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args) {
        //demo();  // use this to see the program read the file and print
        Words words = new Words("aliceinwonderland.txt");
        demo();
        //==================================================//
        //========= Student Code Below =====================//
        //==================================================//
        //
        // Add code below that calls the five methods you created in
        //   the Words class. Use the 'words' object created above.
        
        System.out.println("Code by <Your Name Here>");

        
        
        
        
        
        //==================================================//
        //========= Student Code Above =====================//
        //==================================================//
     }
    
    /************************************************************
     *  D O  N O T   M O D I F Y   T H E   C O D E   B E L O W
     */
    /**
     * Read the words, get the list, print the first 40
     */
    public static void demo() {
        Words words = new Words("aliceinwonderland.txt");
        List<String> wordList = words.getWords();
        printStartOfList(wordList, 40);
    }
    
    /**
     * Pass in a Collection and a count. Print the first count items.
     */
    public static void printStartOfList(Collection<String> list, int count) {
        int maxWords = list.size() > count ? count : list.size();
        Object[] words = list.toArray();
        
        for (int i = 0; i < maxWords; i++) {
            System.out.println( words[i].toString() );
        }
    }

}

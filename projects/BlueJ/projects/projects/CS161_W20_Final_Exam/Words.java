import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.io.*;

/**
 * Final Exam Winter 2020
 * @author <Student Name>
 * Read a text file and store the words from the text file into
 * a List. Add the methods below.
 */

public class Words
{
    //==================================================//
    //========= Student Code Below ========================//
    //==================================================//
    
    /*****************************************************************************
     *   Create methods to implement the following: 
     *   Please put your method code following each comment. Don't mess with the
     *      existing code, it is there to support your code.
     *****************************************************************************/
   
    /**
     * Return the number of words in the word store. Remember
     * the Strings are stored in a List.
     */

    
    /**
     * Return the number of occurences of a particular word
     * in the word store. Remember to use the String .equals( ... ) method
     * to compare Strings. Loop over the strings counting matches.
     * Use a For/Each.
     */


    /**
     * Return an ArrayList (or List) of Integers that represents the index
     * locations of a particular word in the word store. For example, if wordStore
     * is [rabbit, dog, cat, rabbit, cow], the result list for "rabbit" would be [0, 3].
     * Pass in a String and loop over the word store comparing (.equals(...)) each
     * word. If a match is found, add the index location to the results list.
     */
    
    
    /** 
     * Return a HashSet (or Set) of the unique words in the word store.
     * Create the Set and add the words from the List to it. Reminder, take a look 
     * at the API if needed.
     */
    
    
    /**
     * Return a sorted list of words. Look at the TreeSet class in the API.
     * Don't change the stored list inside the object. The returned list should not
     * have duplicates. Copy the list --> the set --> the new list.
     */
    
   //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
   //================                            =====================//
   //================   Student Code Goes ABOVE  =====================//
   //================                            =====================//
   //=================================================================//
 
    /**
     * Default constructor, no file name passed in.
     * Don't change any of the code below....
     */
    public Words() {
        this(NO_FILE);
    }
 
    /**
     * Read a file by creating a scanner object for the file. Read
     * each line of the file and split it into "words". Put the words
     * into a list, remove whitespace, compile the words into an
     * aggregate list of all the words from the file.
     * 
     * @param fileName The name of a file to read words from
     */
    public Words(String fileName) {
        try {
            Scanner words;
            
            if (fileName.equals(NO_FILE) ) {
                words = new Scanner("Best to use a file name.");    
            }
            else {
                words = new Scanner( new File(fileName) );
            }
            
            while ( words.hasNextLine() ) { 
                // read a line of text from the scanner
                String line = words.nextLine();
                // split the line into individual words
                String[] wordArray = line.split("[\\p{javaWhitespace}]");
                // create a List from the array of words
                List<String> wordList = Arrays.asList(wordArray);
                // remove any whitespace words from the list
                wordList = removeWhitespace(wordList);

                if (wordList.size() > 0) {
                    // save the words into aggregate list
                    wordStore.addAll(wordList);
                }
            }
        }
        catch(Exception e) {
            // some sort of file error occured
            System.out.println("Error: " + e);   
        }
    }

    /**
     *  Remove tabs, spaces, and empty lines
     *  @param List of words
     *  @return List with white space stuff removed
     */
    private List<String> removeWhitespace(List<String> list) {
        final String SPACE = " ";
        final String TAB = "\t";
        Iterator<String> it = list.iterator();
        List<String> cleanList = new ArrayList<String>();
        
        while (it.hasNext()) {
            String str = it.next();
            str = str.replaceAll("[^A-Za-z]+", "");
            
            if ( !(str.equals(SPACE) || str.equals(TAB) || str.length() == 0)) {
                cleanList.add(str);
            }
        }
        
        return cleanList;
    }
    
    /**
     * Return the stored words
     * @return List of words
     */
    public List<String> getWords() {
        return wordStore;
    }
    
    /**
     * Basic toString method
     */
    public String toString() {
        return "" + wordStore;
    }
    
    private static final String NO_FILE = "_no_file_";
    private List<String> wordStore = new ArrayList<String>();
}

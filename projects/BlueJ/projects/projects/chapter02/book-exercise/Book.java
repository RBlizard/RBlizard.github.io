
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int length, boolean textbook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = length;
        courseText = textbook;
        refNumber = "";
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3)
        {
            System.out.println("Please enter a number longer than 3 characters");
        }
        else
        {
            refNumber = ref;
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed += 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printDetails()
    {
        System.out.println("Book Author: " + author);
        System.out.println("Book Title: " + title);
        System.out.println("Page Count: " + pages);
        if (refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
            System.out.println("Reference Number: ZZZ");
        }
        System.out.println("This book has been borrowed " + borrowed + " times.");
    }
}

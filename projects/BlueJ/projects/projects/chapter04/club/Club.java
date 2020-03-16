import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Determine the number of members who have joined in the given * month.
     * @param month The month we are interested in.
     * @return The number of members who joined in that month.
     */
    public int joinedInMonth(int month){
        int number = 0;
        if((month < 1) || (month > 12)){
            System.out.println("Please enter a valid month");
        }
        else{
            Iterator<Membership> i = members.iterator();
            while(i.hasNext()){
                Membership current = i.next();
                if(current.getMonth() == month){
                    number ++;
                }
            }
        }
        return number;
    }
    
    
    /**
     * Remove from the club's collection all members who  *joined in the given month,
     * and return them stored in a separate collection object.
     * @param month The month of the membership.
     * @param year The year of the membership.
     * @return the members who joined in the given month and year.
     */
    public ArrayList<Membership> purge(int month, int year){
        ArrayList<Membership> purgedMemberships = new ArrayList<>();
        for (Membership member : members){
            if ((member.getMonth() == month) && (member.getYear() == year)){
                purgedMemberships.add(member);
                members.remove(member);
            }
        }
        return purgedMemberships;
    }
}

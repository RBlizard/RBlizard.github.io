import java.util.ArrayList;
import java.util.Iterator;
/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            //Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        Lot selectedLot = null;
        if(lotNumber >=1){
            for (Lot lot : lots) {
                if(lot.getNumber() == lotNumber) {
                    selectedLot = lot;
                }
            }
        }
        if (selectedLot == null){
            System.out.println("Internal error: Lot with requested number does not exist.");
        }
        return selectedLot;
    }
    
    /**
     * Removes the specified Lot from the Auction.
     * @param lotNumber The number of the lot to return.
     * @return The Lot with the given number, or null
     * if the Lot no longer exists.
     */
    public Lot removeLot(int lotNumber){
        Lot selectedLot = null;
        if(lotNumber >=1){
            for (Lot lot : lots) {
                if(lot.getNumber() == lotNumber) {
                    selectedLot = lot;
                    lots.remove(lot);
                }
            }
        }
        return selectedLot;
    }
    
    /**
     * Closes the auction and prints results of valued lots.
     */
    public void close() {
        for(Lot lot : lots){
            if(lot.getHighestBid() != null){
                System.out.println(lot.toString() + ", Winner: " + 
                lot.getHighestBid().getBidder().getName());       
            }
        }
    }
    
    /**
     * Returns lots that recieved no bids
     * in the form of an ArrayList<Lot>.
     */
    public ArrayList<Lot> getUnsold(){
        ArrayList<Lot> unsoldLots = new ArrayList<>();
        Iterator<Lot> i = lots.iterator();
        
        while(i.hasNext()){
            Lot l = i.next();
            if(l.getHighestBid() == null){
                unsoldLots.add(l);
                i.remove();
            }
            else{
                i.remove();
            }
        }
        return unsoldLots;
    }
}

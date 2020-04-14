import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29 (imperative)
 */
public class AnimalMonitor 
{
    // Records of all the sightings of animals.
    private ArrayList<Sighting> sightings;
    
    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor()
    {
        this.sightings = new ArrayList<>();
    }
    
    /**
     * Add the sightings recorded in the given filename to the current list.
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename)
    {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }
    
    /**
     * Print details of all the sightings.
     */
    public void printList()
    {
        sightings.forEach(record ->
        System.out.println(record.getDetails()));
    }
    
    /**
     * Print the details of all the sightings of the given animal.
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal)
    {
        sightings.stream()
                    .filter(s -> animal.equals(s.getAnimal()))
                    .forEach(s ->
        System.out.println(s.getDetails()));
    }
    
    /**
     * Print the details of all the sightings on a given date.
     * @param dayID The day in question
     */
    public void printSightingsDate(String searchID){
        // sightings.stream()
                    // .filter(s -> searchID.equals(s.getDayID()))
                    // .forEach(s ->
        // System.out.println(s.getDetails()));
    }
    
    /**
     * Print the details of all the sightings of an animal on a given date.
     * @param dayID The day in question
     * @param animal The animal in question
     */
    public void printAnimalDate(String searchID, String animal){
        // sightings.stream()
                    // .filter(s -> searchID.equals(s.getDayID()))
                    // .filter(s -> animal.equals(s.getAnimal()))
                    // .forEach(s ->
        // System.out.println(s.getDetails()));
    }
    
    /**
     * Print all the sightings by the given spotter.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter)
    {
        sightings.stream()
                    .filter(s -> s.getSpotter() == spotter)
                    .map(s -> s.getDetails())
                    .forEach(details ->
        System.out.println(details));
    }
    
    /**
     * Print all the sighting counts of a given animal
     * @param animal The animal in question
     */
    public void printSightingCounts(String animal){
        sightings.stream()
                    .filter(s -> animal.equals(s.getAnimal()))
                    .map(s -> s.getCount())
                    .forEach(count ->
        System.out.println(count));
    }
    
 
    /**
     * Print a list of the types of animal considered to be endangered.
     * @param animalNames A list of animals names.
     * @param dangerThreshold Counts less-than or equal-to to this level
     *                        are considered to be dangerous.
     */
    public void printEndangered(ArrayList<String> animalNames, 
                                int dangerThreshold)
    {
        sightings.stream()
                    .filter(s -> animalNames.contains(s.getAnimal()))
                    .map(s -> s.getAnimal())
                    .forEach(animal ->
        System.out.println(animal));
    }
    
    
    
    /**
     * Return a count of the number of sightings of the given animal.
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal)
    {
        return sightings.stream()
                    .filter(s ->
        animal.equals(s.getAnimal()))
                    .map(s -> s.getCount())
                    .reduce(0, (total, count) -> total + count);
    }
    
    /**
     * Return the count of sightings of a given animal by a 
     * spotter on a specific day
     * @param animal The animal in question
     * @param spotter The spotter in question
     * @param searchID The dayID in question
     */
    public int getDayAnimalSpotterCount(String animal, String searchID, int spotter){
        return sightings.stream()
                    //.filter(s -> searchID.equals(s.dayID()))
                    .filter(s -> animal.equals(s.getAnimal()))
                    .filter(s -> spotter == s.getSpotter())
                    .map(s -> s.getCount())
                    .reduce(0, (total, count) -> total + 1);
    }
    
    /**
     * Returns a String with names of animals spotted by 
     * the spotter on the given day
     * @param spotter The spotter in question
     * @param searchID The dayID in question
     */
    public String getSpotterAnimalsDate(int spotter,String searchID){
        return sightings.stream()
                    //.filter(s -> searchID.equals(s.DayID()))
                    .filter(s -> spotter == s.getSpotter())
                    .map(s -> s.getAnimal())
                    .reduce("", (fullString, animal) -> fullString + ", " + animal);
    }
    
    /**
     * Remove from the sightings list all of those records with
     * a count of zero.
     */
    public void removeZeroCounts()
    {
        sightings.removeIf(s -> s.getCount() == 0);
    }
    
    /**
     * Remove from the sightings list all of those records recorded
     * by a given spotter.
     * @param spotter The spotter in question
     */
    public void removeSpotterSightings(int spotter){
        sightings.removeIf(s -> spotter == s.getSpotter());
    }
    
    /**
     * Returns how many sighting records have been made by a given
     * spotter.
     * @param spotter The spotter in question
     */
    public long getSpotterCount(int spotter){
        return sightings.stream()
                    .filter(s -> spotter == s.getSpotter())
                    .count();
    }
    
    /**
     * Returns the largest count for any given animal in a single
     * sighting record.
     * @param animal The animal in question
     */
    public OptionalInt getLargestCount(String animal){
        return sightings.stream()
                    .filter(s -> animal.equals(s.getAnimal()))
                    .mapToInt(s -> s.getCount())
                    .max();
    }
    
    /**
     * Returns the first sighting recorded of an animal by a 
     * specific spotter.
     * @param animal The animal in question
     * @param spotter The spotter in question
     */
    public Optional<Sighting> getFirstSighting(String animal, int spotter){
        return sightings.stream()
                    .filter(s -> animal.equals(s.getAnimal()))
                    .filter(s -> spotter == s.getSpotter())
                    .findFirst();
    }
    
    
    
    /**
     * Return a list of all sightings of the given type of animal
     * in a particular area.
     * @param animal The type of animal.
     * @param area The ID of the area.
     * @return A list of sightings.
     */
    public ArrayList<Sighting> getSightingsInArea(String animal, int area)
    {
        ArrayList<Sighting> records = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                if(record.getArea() == area) {
                    records.add(record);
                }
            }
        }
        return records;
    }
    
    /**
     * Return a list of all the sightings of the given animal.
     * @param animal The type of animal.
     * @return A list of all sightings of the given animal.
     */
    public ArrayList<Sighting> getSightingsOf(String animal)
    {
        ArrayList<Sighting> filtered = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                filtered.add(record);
            }
        }
        return filtered;
    }
    
}

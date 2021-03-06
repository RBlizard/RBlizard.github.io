
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;   // custom object variable
    private String displayString;    // simulates the actual display
    private Rectangle window;
    private String hoursDisplayValue; // custom variable - 12 hour clock
    private boolean isTwelveHour; // custom Variable - 12 hour clock
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        window = new Rectangle(220,50);
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int second)
    {
        window = new Rectangle(220,50);
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(24);
        setTime(hour, minute, second);
    }

    // custom method - 12 hour clock
    public void setTwelveHour()
    {
        if(!isTwelveHour)
        {
            isTwelveHour = true;
        }
        else
        {
            isTwelveHour = false;
        }
        updateDisplay();
    }
    
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0){ // seconds rolled over
            minutes.increment();
            if(minutes.getValue() == 0) {  // it just rolled over!
                hours.increment();
            }
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        //Custom if statement - 12 hour clock
        if(isTwelveHour)
        {
            // custom if statement - 12 hour clock - calculate 12 hour time
            if(hours.getValue() == 0)
            {
                hoursDisplayValue = "12";
            }
            else if(hours.getValue() > 0 && hours.getValue() <= 12)
            {
                hoursDisplayValue = hours.getDisplayValue();
            }
            else if(hours.getValue() > 12 && hours.getValue() < 22)
            {
                int newValue = hours.getValue() - 12;
                hoursDisplayValue = "0" + newValue;
            }
            else if(hours.getValue() >= 22)
            {
                int newValue = hours.getValue() - 12;
                hoursDisplayValue = "" + newValue;
            }
            
            if(hours.getValue() < 12 || hours.getValue() == 0)
            {
            displayString = hoursDisplayValue + ":" + 
                        minutes.getDisplayValue() + " AM";
            }
            else if(hours.getValue() >= 12)
            {
                displayString = hoursDisplayValue + ":" + 
                        minutes.getDisplayValue() + " PM";
            }
        }
        else
        {
            hoursDisplayValue = hours.getDisplayValue();
            displayString = hoursDisplayValue + ":" + 
                            minutes.getDisplayValue() + ":"
                            + seconds.getDisplayValue();
        }
    }
}

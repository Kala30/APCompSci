
/**
 * Adds two different times in the form of hh:mm:ss
 * 
 * @author Iain Ro, Caleb Yun
 * @version 2/21/2018
 */
public class TimeAdder
{
    /**
     * Converts the String time into seconds
     * @param time  time in form hh:mm:ss
     * @return seconds time in seconds
     */
    public int makeIntoSeconds(String time)
    {
        int hours = Integer.parseInt(time.substring(0,2));
        hours *= 3600;
        int minutes = Integer.parseInt(time.substring(3,5));
        minutes *= 60;
        int seconds = Integer.parseInt(time.substring(6,8));
        return hours + minutes + seconds;
    }
    
    /**
     * Converts int seconds into a time 
     * @param seconds time in seconds
     * @return time String time in hh:mm:ss
     */
    public String timeString(int seconds)
    {
        int hours = 0;
        int minutes = 0;
        if(seconds >=3600)
        {
            hours = seconds/3600;
            seconds %= 3600;
        }
        if(seconds <3600 && seconds >=60)
        {
            minutes = seconds/60;
            seconds %= 60;
        }
        String hourString = "" +hours;
        String minString = "" + minutes;
        String secString = "" + seconds;
        
        if(hours <10) hourString = 0 + hourString;
        if(minutes <10)minString = 0 + minString;
        if(seconds <10) secString = 0 + secString;
        
        
        return "" + hourString + ":" + minString + ":" + secString;
    }
    
    /**
     * Takes two times, and adds them together
     * @param time1 1st String time in the form hh:mm:ss
     * @param time2 2nd String time in the form hh:mm:ss
     * @return The sum of the two strings in the form hh:mm:ss
     */
    public String addTimes (String time1, String time2)
    {
        int timeS1 = makeIntoSeconds(time1);
        int timeS2 = makeIntoSeconds(time2);
        
        int totalS = timeS1 + timeS2;
        return timeString(totalS);
    }
    
}

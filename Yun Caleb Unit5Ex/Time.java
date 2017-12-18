
/**
 * Time Class
 *
 * @author Caleb Yun
 * @version Created on 12/18/2017
 */
public class Time
{
    private int hours;
    private int mins;
    
    public Time(int hours, int mins)
    {
        if ((hours >= 24 || hours < 0) || (mins >= 60 || mins < 0))
        {
            throw new IllegalArgumentException("Invalid time: " + timeString(hours, mins));
        } else {
            this.hours = hours;
            this.mins = mins;
        }
    }
    
    private int toMins()
    {
        return (hours * 60) + mins;
    }
    
    private int toMins(Time timeVal)
    {
        return (timeVal.hours * 60) + timeVal.mins;
    }
    
    public boolean lessThan(Time timeVal)
    {
        return toMins(timeVal) > toMins();
    }
    
    public String toString()
    {
        if (mins < 10)
            return hours + ":0" + mins;
        else
            return hours + ":" + mins;
    }
    
    private String timeString(int hours, int mins)
    {
        if (mins < 10)
            return hours + ":0" + mins;
        else
            return hours + ":" + mins;
    }
    
    public int elapsedSince(Time timeVal)
    {
        if(this.lessThan(timeVal))
            return (24 * 60) - toMins(timeVal) + toMins();
        else
            return toMins() - toMins(timeVal);
    }
}

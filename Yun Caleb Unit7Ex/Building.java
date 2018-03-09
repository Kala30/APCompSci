
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building implements AirConditioner
{
    private double temp = 70;
    
    /**
     * Get the current temperature.
     */
    public double getTemp()
    {
        return temp;
    }
    
    /**
     * Decrease temperature by decrement
     */
    public void decreaseTemp(double decrement)
    {
        temp -= decrement;
    }
    
    /**
     * Increase the temperature by increment.
     */
    public void increaseTemp(double increment)
    {
        temp += increment;
    }
}

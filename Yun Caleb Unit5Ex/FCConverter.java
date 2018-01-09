
/**
 * U5 D5 Coding Exercise: FCConverter
 * 
 * @author Caleb Yun
 * @version 1/9/2018
 */
public class FCConverter
{
    double celsius;
    double fahrenheit;
    
    public double getCelsius()
    {
        return celsius;
    }
    
    public double getFahrenheit()
    {
        return fahrenheit;
    }
    
    public void setCelsius(double degrees)
    {
        celsius = degrees;
        fahrenheit = (9.0/5.0) * degrees + 32;
    }
    
    public void setFahrenheit(double degrees)
    {
        fahrenheit = degrees;
        celsius = (5.0/9.0) * (degrees - 32);
    }
}

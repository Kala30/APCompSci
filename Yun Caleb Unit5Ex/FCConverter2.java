
/**
 * U5 D5 Coding Exercises: FCConverter2
 * 
 * @author Caleb Yun
 * @version 1/9/2018
 */
public class FCConverter2
{   
    public static double cToF(double degrees)
    {
        return (9.0/5.0) * degrees + 32;
    }
    
    public static double fToC(double degrees)
    {
        return (5.0/9.0) * (degrees - 32);
    }
}

/**
 * Pair Programming Exercises
 * 
 * Alissa Hsueh, Caleb Yun
 * 10/24/17
 */
public class PairProgrammingEx
{
    public static boolean isWithin (double x, double y, double r)
    {
        double distance = Math.sqrt(x*x + y*y);
        if (distance <= r)
            return true;
        else
            return false;
    }

    public static String describeTemp(int temp)
    {
        if (temp > 80)
            return "warm";
        else if (temp < 60)
            return "cold";
        else 
            return "mild";
    }

    public static double getPrice(double initialPrice, double weeks)
    {
        if (weeks >= 5)
            return initialPrice * 0.25;
        else if (weeks >= 4)
            return initialPrice * 0.5;
        else if (weeks >= 3)
            return initialPrice * 0.75;
        else 
            return initialPrice;
    }

    public static void main (String[] args)
    {
        System.out.println(getPrice (20, 2)); //20
        System.out.println(getPrice (20, 4)); //10
        
        System.out.println(taxOwed(1000)); //0.0
        System.out.println(taxOwed(10000)); //300.0
    }

    public static double taxOwed(int earnings)
    {
        if (earnings > 60000)
            return earnings * 0.237;
        else if (earnings > 40000)
            return earnings * 0.108;
        else if (earnings > 20000)
            return earnings * 0.055;
        else if (earnings > 5000)
            return earnings * 0.03;
        else
            return 0;
    }
}
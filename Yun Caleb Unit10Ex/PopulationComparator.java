import java.util.Comparator;

/**
 * Population Comparator
 * 
 * @author Caleb Yun
 * @version 4/3/2018
 */
public class PopulationComparator implements Comparator<Country>
{
    private boolean ascending;
    
    // Constructors
    public PopulationComparator()
    {
        ascending = true;
    }
    
    public PopulationComparator(boolean ascend)
    {
        ascending = ascend;
    }
    
    public int compare(Country country1, Country country2)
    {
        int toReturn = country1.compareTo(country2);

        if (ascending)
            return toReturn;
        else
            return -toReturn;
    }
}

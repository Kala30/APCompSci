import java.util.Comparator;

/**
 * Name Comparator Class
 * 
 * @author Caleb Yun
 * @version 5/3/2018
 */
public class NameComparator implements Comparator<Country>
{
    private boolean ascending;

    // Constructor
    public NameComparator()
    {
        ascending = true;
    }

    public NameComparator(boolean ascend)
    {
        ascending = ascend;
    }

    public int compare(Country country1, Country country2)
    {
        int toReturn = country1.getName().compareTo(country2.getName());

        if (ascending)
            return toReturn;
        else
            return -toReturn;
    }
}

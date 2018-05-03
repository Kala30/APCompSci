import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCountry
{
    public static void main(String[] args)
    {
        ArrayList<Country> c = new ArrayList<Country>();
        c.add(new Country("Taiwan", 1175));
        c.add(new Country("Denmark", 3124));
        c.add(new Country("Iran", 5140));
        c.add(new Country("Italy", 2900));
        c.add(new Country("France", 2650));

        System.out.println("\nCountry List: before sorting");
        for (int i=0; i<c.size(); i++)
            System.out.println(c.get(i));

        //Name Comparator Sort goes here.
        Collections.sort(c, new NameComparator());

        System.out.println("\nCountry List: after sorting by name");
        for (int i=0; i<c.size(); i++)
            System.out.println(c.get(i)); 

        //Population Comparator Sort goes here.
        Collections.sort(c, new PopulationComparator());

        System.out.println("\nCountry List: after sorting by population");
        for (int i=0; i<c.size(); i++)
            System.out.println(c.get(i)); 
    }
}

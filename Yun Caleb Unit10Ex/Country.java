/**
 * Country Class
 * 
 * @author Caleb Yun
 * @version 5/1/2018
 */
public class Country implements Comparable
{
    private String name;
    private int population;

    public Country(String nm)
    {
        name = nm; 
        population = 0; 
    }

    public Country(String nm, int pop) 
    { 
        name = nm; 
        population = pop; 
    }

    public String getName() 
    {
        return name; 
    }

    public int getPopulation() 
    { 
        return population; 
    }

    public boolean equals(Object other)
    {
        return name.equals(((Country)other).getName());
    }

    public int compareTo(Object other)
    {
        return population - ((Country)other).getPopulation();
    }

    public String toString()
    {
        return name + ": " + population;
    }
}

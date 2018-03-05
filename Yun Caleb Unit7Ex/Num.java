// LISTING 5.2
//********************************************************************
//  Num.java       Author: Lewis/Loftus/Cocking
//
//  Represents a single integer as an object.
//********************************************************************
public class Num implements Comparable
{
    private int value;
    //-----------------------------------------------------------------
    //  Sets up the new Num object, storing an initial value.
    //-----------------------------------------------------------------
    public Num (int update)
    {
        value = update;
    }
    //-----------------------------------------------------------------
    //  Returns the stored integer value.
    //-----------------------------------------------------------------
    public int getValue ()
    {
        return value;
    }
    //-----------------------------------------------------------------
    //  Sets the stored value to the newly specified value.
    //-----------------------------------------------------------------
    public void setValue (int update)
    {
        value = update;
    }
    //-----------------------------------------------------------------
    //  Returns the stored integer value as a string.
    //-----------------------------------------------------------------
    public String toString ()
    {
        return value + "";
    }
    //-----------------------------------------------------------------
    //  Returns true if this and another object have the same value.
    //-----------------------------------------------------------------
    public boolean equals(Object obj)
    {
        return this.value == ((Num)obj).getValue();
    }
    //-----------------------------------------------------------------
    //  Returns -1 if other value is greater.
    //  Returns 1 if this value is greater.
    //  Returns 0 is they are equal.
    //-----------------------------------------------------------------
    public int compareTo(Object obj)
    {
        int otherValue = ((Num)obj).getValue();
        if (value < otherValue)
            return -1;
        else if (value > otherValue)
            return 1;
        else
            return 0;
    }
}
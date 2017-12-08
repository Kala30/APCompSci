/**
 *  Write a description of class Fraction here.
 *
 *  @author (your name)
 *  @version (a version number or a date)
 */
public class Fraction
{
    // Field Variables
    private int num;
    private int denom;
    
    // Constructors
    public Fraction() {
        num = 0;
        denom = 1;
    }
    
    public Fraction(int num) {
        this.num = num;
        this.denom = 1;
    }
    
    public Fraction(int num, int denom)
    {
        if (denom != 0) {
            this.num = num;
            this.denom = denom;
            reduce();
        } else
            throw new IllegalArgumentException("Fraction construction error: denominator is 0");
    }
    
    // Methods
    // Setters
    
    // Getters
    
    // *** private helper methods ************************
    //Reduces this fraction by the gcf and makes denom > 0
    private void reduce()
    {
        if (num == 0)
        {
            denom = 1;
            return;
        }
        if (denom < 0)
        {
            num = -num;
            denom = -denom;
        }
        int q = gcf(Math.abs(num), denom);
        num /= q;
        denom /= q;
    }
    //Returns the greatest common factor of two positive integers
    public static int gcf(int n, int d)
    {
        if (n <= 0 || d <= 0)
        {
            throw new IllegalArgumentException("gcf precondition failed: "
                + n + ", " + d);
        }
        if (n % d == 0)
            return d;
        else if (d % n == 0)
            return n;
        else
            return gcf(n % d, d % n);
    }
}

/**
 *  Fraction Class
 *
 *  @author Caleb Yun
 *  @version Created on 12/8/2017
 */
public class Fraction
{
    // Field Variables
    public static final int DFLT_DENOM = 10000;
    private int num;
    private int denom;
    private static int fractionCounter = 0;
    
    // Constructors
    public Fraction() {
        num = 0;
        denom = 1;
        //this(0);
        //this(0, 1);
        fractionCounter++;
    }
    
    public Fraction(int num) {
        this.num = num;
        this.denom = 1;
        //this(num, 1);
        fractionCounter++;
    }
    
    public Fraction(int num, int denom)
    {
        if (denom != 0) {
            this.num = num;
            this.denom = denom;
            reduce();
            fractionCounter++;
        } else
            throw new IllegalArgumentException("Fraction construction error: denominator is 0");
    }
    
    public Fraction(Fraction other)
    {
        this.num = other.num;
        this.denom = other.denom;
        //this(other.num, other.denom);
    }
    
    
    // Methods
    
    public Fraction add(Fraction input)
    {
        int num = (this.num * input.denom) + (input.num * this.denom);
        int denom = this.denom * input.denom;
        return new Fraction(num, denom);
    }
    
    public Fraction add(int m)
    {
        int num  = this.num + (m * this.denom);
        return new Fraction(num, this.denom);
    }
    
    public Fraction multiply(Fraction input)
    {
        int num = input.num * this.num;
        int denom = input.denom * this.denom;
        return new Fraction(num, denom);
    }
    
    public Fraction multiply(int m)
    {
        return new Fraction(this.num * m, this.denom);
    }
    
    // Setters
    public static void resetFractionCounter()
    {
        fractionCounter = 0;
    }
    
    // Getters
    public double getValue()
    {
        return (double) num / denom;
    }
    
    public static int getFractionCounter()
    {
        return fractionCounter;
    }
    
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
            throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
        }
        if (n % d == 0)
            return d;
        else if (d % n == 0)
            return n;
        else
            return gcf(n % d, d % n);
    }
    
    public String toString()
    {
        return num + "/" + denom;
    }
    
    public static Fraction valueOf(double x)
    {
        return new Fraction((int) Math.round( x * DFLT_DENOM) , DFLT_DENOM);
    }
}

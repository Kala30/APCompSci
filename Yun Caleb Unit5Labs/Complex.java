
/**
 * Complex Class
 * 
 * @author Caleb Yun, Grant Cai 
 * @version 1/11/2018
 */
public class Complex
{
    private double a;
    private double b;

    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Complex(double a)
    {
        this(a, 0.0);
    }
    
    public double getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public double abs()
    {
        return Math.sqrt((a*a) + (b*b));
    }
    
    public Complex add(Complex other)
    {
        return new Complex(this.a + other.a, this.b + other.b); 
    }
    
    public Complex add(double input)
    {
        return new Complex(this.a + input, this.b);
    }
    
    public Complex multiply(Complex other)
    {
        return new Complex((this.a * other.a) - (this.b * other.b), (this.a * other.b) + (this.b * other.a));
    }
    
    public Complex multiply(double input)
    {
        return new Complex(this.a * input, this.b * input);
    }
    
    public boolean equals(Complex input)
    {
        return (this.a == input.a && this.b == input.b);
    }
    
    public String toString()
    {
        return this.a + " + " + this.b + "i";
    }
}

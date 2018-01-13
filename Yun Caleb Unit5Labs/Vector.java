
/**
 * Unit 5 Labs Pt. 2: Vector Class
 *
 * @author Caleb Yun
 * @version 1/13/2018
 */
public class Vector
{
    private double magnitude;
    private double direction;
    
    public Vector(double magnitude, double direction)
    {
        this.magnitude = magnitude;
        this.direction = direction;
    }
    
    public Vector()
    {
        this(0, 0);
    }
    
    public double getMagnitude()
    {
        return magnitude;
    }
    
    public double getDirection()
    {
        return direction;
    }
    
    public double getXComponent()
    {
        return Math.cos(Math.toRadians(direction)) * magnitude;
    }
    
    public double getYComponent()
    {
        return Math.sin(Math.toRadians(direction)) * magnitude;
    }
    
    public Vector addVector(Vector other)
    {
        double xComponent = this.getXComponent() + other.getXComponent();
        double yComponent = this.getYComponent() + other.getYComponent();
        
        double magnitude = Math.sqrt(Math.pow(xComponent, 2) + Math.pow(yComponent, 2));
        double direction = Math.toDegrees(Math.atan(yComponent / xComponent));
        return new Vector(magnitude, direction);
    }
    
    public boolean equals(Vector other)
    {
        return this.magnitude == other.magnitude && this.direction == other.direction;
    }
    
    public String toString()
    {
        return "Magnitude: " + magnitude + " Direction: " + direction;
    }
}

import java.io.*;
import java.util.*;

/**
 * MethodPractice gives solutions to the Methods Practice we completed in class and for homework.  
 * Check your work and ask any questions now.
 *
 * @author Ms. Jaime
 * @version Fall 2017
 */
public class MethodPractice
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Radius: ");
        String input = null;
        try {
            input = reader.readLine();
            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Error");
        }

        if(input != null) {
            double radius = Double.parseDouble(input);
            double largeRadius = 10;
            double height = 10;

            double area = circleArea(radius);
            double ringArea = ringArea(radius, largeRadius);
            double cylVol = cylinderVolume(radius, height);

            System.out.println("Circle Area: " + area);
            System.out.println("Ring Area: " + ringArea);
            System.out.println("Cylinder Volume: " + cylVol);
        } else {
            System.out.println("Input Error");
        }
    }

    //WE DID THE FOLLOWING IN CLASS-------------------------------------------------------------

    //EXAMPLE: returns two times the given amount
    public static int doubleIt(int x)
    {
        return x * 2;
    }

    //METHOD #1: returns the square of the given parameter
    public static double square(double x)
    {
        return x * x;
    }

    //METHOD #2: returns the sum of the parameters
    public static int addThem(int x, int y)
    {
        return x + y;
    }

    //METHOD #3: returns the area of a circle of radius r
    public static double circleArea(double r)
    {
        return Math.PI * r * r;  //could also have: Math.PI * square(r);
    }

    //METHOD #4: returns the value of degrees Celcius as degrees Fahrenheit
    public static double cToF(double celsius) 
    {
        return 1.8 * celsius + 32;
    }

    //METHOD #5: returns the are of a triangle with given base and height
    public static double triangleArea(double base, double height) 
    {
        return 0.5*base*height;
    }

    //METHOD #6: returns the number of inches in a given amount of feet and inches
    public static int lengthInInches(int feet, int inches) 
    {
        return 12*feet + inches;
    }

    //METHOD #7: returns the current temperature given an amount of cricket chirps
    public static double currentTemp(double chirps) 
    {
        return ((chirps * 4) + 40) * 0.25;
    }

    //WE DID THE FOLLOWING FOR HOMEWORK------------------------------------------------------------
    //EXAMPLE: returns the area of a ring of inner radius "inner" and outer radius "outer"
    public static double ringArea(double inner, double outer)
    {
        return circleArea(outer) - circleArea(inner);
    }

    //Number 2: define sumCoins here
    public static int sumCoins(int quarters, int dimes, int nickels, int pennies) 
    {
        return (quarters*25)+(dimes*10)+(nickels*5)+(pennies);
    }

    //Number 3: define distanceFallen here
    public static double distanceFallen(double t) 
    {
        return 0.5 * 9.8 * square(t);
    }

    //Number 4: define cylinderVolume here
    public static double cylinderVolume(double baseradius, double height)
    {
        return circleArea(baseradius) * height;
    }

    //Number 5: define totalProfit here
    public static double totalProfit(int attendance)
    {
        return (5*attendance)-(20 + 0.5*attendance);
    }
}
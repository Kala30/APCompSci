
/**
 * Write a description of class Exercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercises
{
    public static void printStars(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print("*");
        }
    }

    public static void reverseTriangle(int num)
    {
        if(num == 1)
            printStars(1);
        else {
            printStars(num);
            System.out.print("\n");
            reverseTriangle(num - 1);
        }
    }
    
    public static void printTriangle(int num)
    {
        if(num == 1)
            printStars(num);
        else
        {
            printStars(num - (num-1));
            System.out.println();
            printTriangle(num - 1);
        }
    }
}

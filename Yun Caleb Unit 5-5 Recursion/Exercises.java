
/**
 * Recursion Coding Assignment
 * 
 * @author Iain Ro, Caleb Yun 
 * @version 1/30/2018
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

    private static int orig = 1;

    public static void printTriangle(int num)
    {
        if(num == 1)
            printStars(orig);
        else
        {
            printStars(orig);
            orig++;
            System.out.println();
            printTriangle(num - 1);
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

    public static int iterMultiplication(int a, int b)
    {
        int sum = 0;
        for (int i = b; i > 0; i--)
        {
            sum += a;
        }
        return sum;
    }

    public static int recursiveMultiplication(int a, int b)
    {

        if(b == 1)return a;
        else
        {
            return a + recursiveMultiplication(a, b-1);
        }
    }

    public static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else {
            return x * power(x, y - 1);
        }
    }

    public static int numberOfDigits(int num)
    {
        if(num<10)return 1;
        else
        {
            return 1 + numberOfDigits(num / 10);
        }
    }

    public static int simplifyAngle(int angle)
    {
        if (angle < 360)
            return angle;
        else {
            return simplifyAngle(angle-360);
        }
    }
    
    public static int fibonacci(int n)
    {
        if (n == 1 || n == 2)
            return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    
}

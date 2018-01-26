/**
 * Recursion Examples
 * 
 * @author Caleb Yun 
 * @version 1/26/2018
 */
public class Examples
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorialLoop(5));

        System.out.println(sum(10));

        System.out.println(gcf(4,12));
        
        mystery(157);
    }

    public static int factorial(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialLoop(int num)
    {
        int product = 1;
        for (int i = 1; i <= num; i++)
        {
            product *= i;
        }
        return product;
    }

    public static int sum(int n)
    {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n-1);
        }
    }

    public static int gcfLoop(int a, int b)
    {
        while (a != b) {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static int gcf(int a, int b)
    {
        if (a == b)
            return a;
        else {
            if (a > b)
                return gcf(a-b, b);
            else
                return gcf(a, b-a);
        }
    }

    public static void mystery(int x)
    {
        System.out.println(x % 10);

        if(x / 10 != 0)
        {
            mystery(x/10);
        }

        System.out.println(x % 10);
    }
}
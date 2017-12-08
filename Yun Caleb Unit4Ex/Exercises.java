
/**
 * AP CS: Unit 4 Exercises
 * 
 * @author Caleb Yun
 * @version Created on 11/13/2017
 */

import java.util.Scanner;

public class Exercises
{
    public static void main(String[] args)
    {
        System.out.println("monthsUntilReady(): " + monthsUntilReady());
        System.out.println("addOdds(100): " + addOdds(100));
        System.out.println("printSum()");
        printSum();
    }

    public static void mexicoPop()
    {
        double population = 106.2;
        int year = 2005;
        while(population <= 120)
        {
            population = population * 1.017;
            year++;
        }

        System.out.println(year);
    }

    public static int monthsUntilReady()
    {
        int score = 0;
        int months = 0;
        while(score <= 95)
        {
            score += 10;
            months++;
        }

        return months;
    }

    public static int addOdds(int num)
    {
        int sum = 0;
        for (int i = 1; i <= num; i += 2)
        {
            sum += i;
        }
        return sum;
    }

    public static void printSum()
    {
        int num = 0;
        int sum = 0;
        String output = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a positive integer under 10: ");
            num = sc.nextInt();
            sum += num;
            if(num <= 0 || num > 10)
                output += num + " + ";
            else
                output += num;
        } while (num <= 0 || num > 10);

        System.out.println(output + " = " + sum);
    }

    public static int sumDigits(int num)
    {
        String digits = Integer.toString(num);
        int sum = 0;

        for (int i = digits.length() - 1; i >= 0; i--)
        {
            sum += Character.getNumericValue(digits.charAt(i));
        }

        return sum;
    }

    public static void drawBox(int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void drawReverseWedge(int size)
    {
        int row = 1;
        
        for (; row <= size; row++)
        {
            for (int i = 0; i < size - row; i++)
            {
                System.out.print(" ");
            }
            
            for (int i = 0; i < row; i++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    public static void printStarTriangle(int size)
    {
        int row = 1;
        for(; row <= size; row++)
        {
            for (int i = 0; i < (size - row); i++)
            {
                System.out.print(" ");
            }
            
            for (int i = 0; i < 2 * row - 1; i++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
    
    public static void orderingRipples()
    {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        final double PRICE = 26;
        String response = "";
        
        do {
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            System.out.println("You have ordered " + quantity + " Ripples -- " + "$" + (quantity * price));
            
            
        } while (response = "y");
    }
}
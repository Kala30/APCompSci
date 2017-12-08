/**
 * Unit 3 Examples.
 * 
 * @author Ms. Jaime 
 * @version Fall 2017
 */

import java.util.Scanner;
import java.util.Random;

public class Examples
{
    //DAY 1-------------------------------------------------------------------------------------------
    //EXAMPLE #1
    //This method is a modified version of Age.java from LLC book
    //Takes in age and prints comments based on age
    public static void ageMessage(int age)
    {
        final int MINOR = 18;

        System.out.println("You are " + age + " years old");

        if(age < MINOR)
            System.out.println("Enjoy being young!");

        System.out.println("Remember, age is a state of mind.");
    }

    //EXAMPLE #2
    //This method is a modified version of Wages.java from LLC book
    //Takes in the number of hours worked and calculates wages.
    public static void wages(int hours)
    {
        final double RATE = 8.25;  // regular pay rate
        final int STANDARD = 40;   // standard hours in a work week

        double pay = 0.0;

        // Pay overtime at "time and a half"
        if (hours > STANDARD)
            pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
        else
            pay = hours * RATE;

        System.out.println ("Gross earnings: " + pay);
    }

    //EXAMPLE #3
    //Write your solution below
    public static boolean isNegative(double num)
    {
        if (num < 0)
            return true;
        else
            return false;

        // OR: return num < 0;
    }

    //EXAMPLE #4
    //This method is a modified version of Guessing.java from LLC book
    //Plays a simple guessing game with the user.
    public static void guessingGame()
    {
        final int MAX = 10;
        int answer, guess;
        Scanner scan = new Scanner (System.in);

        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;

        System.out.print ("I'm thinking of a number between 1 and "
            + MAX + ". Guess what it is: ");
        guess = scan.nextInt();

        if (guess == answer)
            System.out.println ("You got it! Good guessing!");
        else
        {
            System.out.println ("That is not correct, sorry.");
            System.out.println ("The number was " + answer);
        }
    }

    //EXAMPLE #5    
    //Write your solution below
    public static String describeNumber(int num)
    {
        if (num == 0)
            return "zero";
        else if (num > 0)
            return "positive";
        else
            return "negative";
    }

    //EXAMPLE #6
    //This method is a modified version of MinOfThree.java from LLC book
    //Reads three integers from the user and determines the smallest value.
    public static void minOfThree()
    {
        int num1, num2, num3, min = 0;
        Scanner scan = new Scanner (System.in);

        System.out.println ("Enter three integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 < num2)
        {
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        }
        else
        {
            if (num2 < num3)
                min = num2;
            else
                min = num3;
        }

        System.out.println ("Minimum value: " + min);

    }

    // Example #7

    public static String isTeenager(int age)
    {
        if (age > 12 && age < 20)
            return "You are a teenager";
        else
            return "You are not a teenager";
    }

    // Example #8
    
    public static String isTeenager2(int age)
    {
        if (age < 13 || age > 19)
            return "You are not a teenager";
        else
            return "You are a teenager";
    }
}
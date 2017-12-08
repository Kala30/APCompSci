import java.util.Scanner;

/**
 * Unit 2 In-Class Exercises
 * 
 * @author Caleb Yun 
 * @version Created on 9/27/17
 */
public class Exercises
{
    public static void main(String[] args)
    {
        // Method calls with literal values
        //swapOnesTens(36);
        //swapDigits(123);
        // Method call with variable
        //int num = 12;
        //swapOnesTens(num);
        
        System.out.println(round(36.4));
        System.out.println(round(-68.7));
    }

    public static void swapOnesTens(int number)
    {
        int tens = number / 10;
        int ones = number % 10;

        System.out.println("Original: " + number);
        System.out.println("Swapped: " + Integer.toString(ones) + Integer.toString(tens));
        System.out.println();
    }

    public static void swapDigits(int number)
    {
        String numberString = Integer.toString(number);
        String result = "";

        for (int i = numberString.length() - 1; i >= 0; i--)
        {
            result = result + numberString.charAt(i);
        }

        System.out.println("Original: " + number);
        System.out.println("Swapped: " + result);
        System.out.println();
    }

    public static int round(double number)
    {
        int result = 0;

        if (number >= 0) {   // Positive Number
            result = (int) (number + 0.5);
        } else if (number < 0) {    //Negative Number
            result = (int) (number - 0.5);
        }

        return result;
    }
    
    public static int randomInt(int lower, int upper)
    {
        int result = (int) (Math.random() * (upper - lower) + lower);
        return result;
    }
    
    public static int random1To10()
    {
        int result = (int) (Math.random() * 10 + 1);
        return result;
    }
    
    public static void average()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num 1: ");
        double double1 = sc.nextDouble();
        
        System.out.print("Num 2: ");
        double double2 = sc.nextDouble();
        
        System.out.print("Num 3: ");
        double double3 = sc.nextDouble();
        
        double avg = (double1 + double2 + double3) / 3;
        
        System.out.println("\nAverage: " + avg);
    }
    
    public static void timeFromSeconds()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Seconds: ");
        double input = sc.nextDouble();
        
        int hours = (int) (input / 3600);
        int mins = (int) ((input % 3600) / 60);
        double secs = (int)(input % 60) + (input - (int)input);
        
        System.out.println(hours + " hours " + mins + " minutes and " + secs + " seconds");
    }
}
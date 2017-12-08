import java.util.Scanner;
import java.util.InputMismatchException;
import java.awt.Color;

/**
 * Unit 3 Exercises
 * 
 * @author Caleb Yun
 * @version 10/20/2017
 */

public class Exercises
{
    public static double absoluteValue (double num)
    {
        if (num < 0)
            return num * -1;
        else
            return num;
    }

    public static boolean is0(int num)
    {
        return num == 0;
    }

    public static void numPoem()
    {
        Scanner sc = new Scanner(System.in);
        int input = -1;

        while (input != 0)
        {
            System.out.print("Enter a number 1-10 (or 0 to quit): ");
            try {
                input = sc.nextInt();

                if (input == 0)
                    System.out.println("Bye");
                else if (input < 0)
                    System.out.println("Integer is out of range");
                else if (input <= 2)
                    System.out.println("Buckle your shoe");
                else if (input <= 4)
                    System.out.println("Shut the door");
                else if (input <= 6)
                    System.out.println("Pick up sticks");
                else if (input <= 8)
                    System.out.println("Lay them straight");
                else if (input <= 10)
                    System.out.println("A big fat hen");
                else
                    System.out.println("Integer is out of range");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.next();
            }
        }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1 == year2)
        {
            if (month1 == month2)
                return day1 > day2;
            else
                return month1 > month2;
        }
        else
        {
            return year1 > year2;
        }
    }

    public static double getOrderTotal(int bp, int nb)
    {
        int total = bp + nb;

        if (bp == 1 && nb == 1)
            return 37.95;
        else if (total >= 12)
            return total * 14.0;
        else if (total >= 3)
            return total * 15.95;
        else
            return (bp * 18.95) + (nb * 21.95);
    }

    public static Color bestMatch(int r, int g, int b)
    {
        if (r > g && r > b)
            return Color.RED;
        else if (g > r && g > b)
            return Color.GREEN;
        else if (b > r && b > g)
            return Color.BLUE;
        else if (r == g && r > b)
            return Color.YELLOW;  // 255, 255, 0
        else if (r == b && r > g)
            return Color.MAGENTA; // 255, 0, 255
        else if (g == b && g > r)
            return Color.CYAN;    // 0, 255, 255
        else if (r == g && g == b)
            return Color.GRAY;
        else
            return null;
    }
}

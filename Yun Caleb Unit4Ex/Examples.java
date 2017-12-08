/**
 * AP CS: Unit 4 Examples
 * 
 * @author Caleb Yun
 * @version Created on 11/8/2017
 */

import java.util.Scanner;

public class Examples
{
    public static void counter(int num)
    {
        int i = 1;
        while (i <= num)
        {
            System.out.println(i);
            i++;
        }
        //System.out.println(i);  Scope of i is within method
        System.out.println("Done");
    }
    
    public static void counter2(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }
        //System.out.println(i);  Scope of i is within for
        System.out.println("Done");
    }
    
    public static void enterNum()
    {
        Scanner input = new Scanner(System.in);
        int num;
        
        do
        {
            System.out.print("Enter an integer from 4 to 16: ");
            num = input.nextInt();
            System.out.println("You picked #" + num);
        }while(num >= 4 && num <= 16);
        
        System.out.println("That's not an integer fom 4 to 16. GOODBYE! >(");
    }
    
    public static void even()
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        
        do
        {
            System.out.print("Enter an even integer: ");
            num = input.nextInt();
        } while(num % 2 != 0);
        
        System.out.println("Thank you!");
    }
    
    //Example #5
    public static void hereAgain()
    {
        int count1 = 1;
        int count2;

        while(count1 <= 10)
        {
            count2 = 1;
            while(count2 <= 50)
            {
                System.out.println("Here again");
                count2++;
            }
            count1++;
        }
    }
    
    //Example #6
    public static void printStars(int rows)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/**
 * Write a description of class Unit3Labs here.
 * 
 * @author Caleb Yun, Grant Cai
 * @version Created on 11/1/17
 */
public class Unit3Labs
{
    static String oddOrEven(int input)
    {
        int remainder = input % 2;
        if (remainder == 1)
            return "odd";
        else if (remainder == 0)
            return "even";
        else
            return "error";
    }
    
    static String firstDigitOddEven(int input)
    {
        if (input > 0 && input < 10)
            return oddOrEven(input);
        else if (input >= 10 && input < 100)
            return oddOrEven(input / 10);
        else if (input >= 100 && input < 1000)
            return oddOrEven(input / 100);
        else
            return "error";
    }
    
    static void testCalendars()
    {
        Calendars calendars1 = new Calendars(7, 20, 2010);
        System.out.println("7/20/2010: " + calendars1.isValid());
        Calendars calendars2 = new Calendars(13, 1, 2009);
        System.out.println("13/1/2009: " + calendars2.isValid());
        Calendars calendars3 = new Calendars(11, 31, 2009);
        System.out.println("11/31/2009: " + calendars3.isValid());
        Calendars calendars4 = new Calendars(2, 29, 2007);
        System.out.println("2/29/2007: " + calendars4.isValid());
        Calendars calendars5 = new Calendars(2, 29, 2000);
        System.out.println("2/29/2000: " + calendars5.isValid());
    }
}

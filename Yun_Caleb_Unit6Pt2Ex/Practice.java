import java.text.DecimalFormat;

/**
 * Unit 6- 3: Converting Numbers to Strings
 * 
 * @author Caleb Yun
 * @version 2/14/2018
 */
public class Practice
{
    public static void main(String[] args)
    {
        int j = 314;

        // Concatenation
        String s = "" + j; // s gets the value "888"

        // Integer.toString
        String r = Integer.toString(j); // Using Integer wrapper class

        // Double.toString
        Double n = 45.6;
        String w = Double.toString(j); // "45.6"

        // valueOf
        String t = String.valueOf(j); // "888"

        // Wrapper Classes
        Integer u = new Integer(j);
        j = u.intValue();

        Character ch = new Character('c');
        char pCh  = ch.charValue();
        
        try
        {
            n = Integer.parseInt(str4);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Invalid input, reenter");
        }

    }

    /**
     * DecimalFormat examples
     */
    public static void formatting()
    {
        //Example 1
        double amt = 56.7381;
        DecimalFormat money = new DecimalFormat("0.00");
        String str1 = money.format(amt);
        System.out.println(str1);

        //Example 2
        double amt2 = 0.7381;
        String str2 = money.format(amt2);
        System.out.println(str2);

        //Example 3
        double amt3 = 12345678.9;
        String str3 = money.format(amt3);
        System.out.println(str3);

        //Example 4
        DecimalFormat money4 = new DecimalFormat("$#,##0.00");
        String str4 = money4.format(amt3);
        System.out.println(str4);

        //Example 5
        DecimalFormat twoDigits = new DecimalFormat("00");
        int minutes = 7;
        String str5 = twoDigits.format(minutes);
        System.out.println(str5);
    }

    /**
     * More formatting examples
     */
    public static void formatting2()
    {
        int m = 5, d = 13, y = 2007;
        double amt = 123.5;

        System.out.printf("Date: %02d/%02d/%d Amount = %7.2f\n", m, d, y, amt);
        String s = String.format("Date: %02d/%02d/%d  Amount = %7.2f\n", m, d, y, amt);
    }
}

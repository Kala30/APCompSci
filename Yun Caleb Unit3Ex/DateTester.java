import java.util.Scanner;

public class DateTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the first date");
        System.out.print("Month: ");
        int month1 = kb.nextInt();
        System.out.print("Day: ");
        int day1 = kb.nextInt();
        System.out.print("Year: ");
        int year1 = kb.nextInt();

        System.out.println("Enter the second date");
        System.out.print("Month: ");
        int month2 = kb.nextInt();
        System.out.print("Day: ");
        int day2 = kb.nextInt();
        System.out.print("Year: ");
        int year2 = kb.nextInt();

        System.out.println();  // blank line

        String msg = month1 + "/" + day1 + "/" + year1;
        if (Exercises.isLater(month1, day1, year1, month2, day2, year2))
            msg += " IS ";
        else 
            msg += " is NOT ";
        msg += "later than " + month2 + "/" + day2 + "/" + year2;
        System.out.println(msg);
    }
}
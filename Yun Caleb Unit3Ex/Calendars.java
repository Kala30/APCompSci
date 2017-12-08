
/**
 * Calendars Class
 * 
 * @author Caleb Yun, Grant Cai
 * @version 11/1/17
 */
public class Calendars
{
    // Field varaibles can be used throughout the entire
    // class without having to be drclared again.
    private int month, day, year;

    // Constructor initializes the values of the
    // month, day, and year
    public Calendars(int month, int day, int year)
    {
        this.month = month;
        this. day = day;
        this. year = year;
    }

    // Write methods below
    public boolean isValid()
    {
        return isValidMonth() && isValidDay();
    }

    public boolean isLeapYear()
    {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else if (year % 400 == 0)
            return true;
        else
            return false;
    }

    public boolean isValidMonth()
    {
        return month >= 1 && month <= 12;
    }

    public boolean isValidDay()
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return (day >= 1 && day <=31);
        else if (month == 2)
            if (isLeapYear())
                return (day >=1 && day <= 29);
            else
                return (day >=1 && day <= 28);
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return (day >= 1 && day <= 30);
        else
            return false;
    }

    public int getTotalDays()
    {
        return getDaysfromYear() + getDaysfromMonth() + getLeapDays() + day;
    }

    public int getDaysfromYear()
    {
        return year * 365;
    }

    public int getDaysfromMonth()
    {
        int result = 0;

        if (month > 1)
            result += 31;
        if (month > 2)
            result += 28;
        if (month > 3)
            result += 31;
        if (month > 4)
            result += 30;
        if (month > 5)
            result += 31;
        if (month > 6)
            result += 30;
        if (month > 7)
            result += 31;
        if (month > 8)
            result += 31;
        if (month > 9)
            result += 30;
        if (month > 10)
            result += 31;
        if (month > 11)
            result += 30;

        return result;
    }

    public int getLeapDays()
    {
        return (year / 4) - (year / 100) + (year / 400);
    }

    public String getDayOfWeek()
    {
        int remainder = getTotalDays() % 7;
        String dayOfWeek;
        switch(remainder) {
            case 0: dayOfWeek = "Saturday";
                    break;
            case 1: dayOfWeek = "Sunday";
                    break;
            case 2: dayOfWeek = "Monday";
                    break;
            case 3: dayOfWeek = "Tuesday";
                    break;
            case 4: dayOfWeek = "Wednesday";
                    break;
            case 5: dayOfWeek = "Thursday";
                    break;
            case 6: dayOfWeek = "Friday";
                    break;
            default:
                    dayOfWeek = "Error";
                    break;
        }
        
        return dayOfWeek;
    }
}

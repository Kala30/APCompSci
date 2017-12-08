public class Unit3LabsAndCalendarsTester extends junit.framework.TestCase
{ 
    public void testOddEven1()
    {
        assertEquals("even", Unit3Labs.oddOrEven(16));
    }
    
    public void testOddEven2()
    {
        assertEquals("odd", Unit3Labs.firstDigitOddEven(134));
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////
    //TEST CALEDARS1
    public void testCalendar1()
    {
        Calendars cal = new Calendars(7, 20, 2010);
        assertEquals(true, cal.isValid());
    }

    public void testCalendar2()
    {
        Calendars cal = new Calendars(13, 1, 2009);
        assertEquals(false, cal.isValid());
    }

    public void testCalendar3()
    {
        Calendars cal = new Calendars(11, 31, 2009);
        assertEquals(false, cal.isValid());
    }

    public void testCalendar4()
    {
        Calendars cal = new Calendars(2, 29, 2007);
        assertEquals(false, cal.isValid());
    }

    public void testCalendar5()
    {
        Calendars cal = new Calendars(2, 29, 2000);
        assertEquals(true, cal.isValid());
    }

    /////////////////////////////////////////////////////////////////////
    //Calendar2
    /////////////////////////////////////////////////////////////////////
    public void testCalendar2_1()
    {
        Calendars cal = new Calendars(7, 4, 1776);
        assertEquals("Thursday", cal.getDayOfWeek());
    }

    public void testCalendar2_2()
    {
        Calendars cal = new Calendars(4, 15, 1865);
        assertEquals("Saturday", cal.getDayOfWeek());
    }
    
    public void testCalendar2_3()
    {
        Calendars cal = new Calendars(10, 14, 2016);
        assertEquals("Friday", cal.getDayOfWeek());
    }

   
}

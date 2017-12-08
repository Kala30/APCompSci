public class ExercisesTester extends junit.framework.TestCase
{
    public void testAbsoluteValue1()
    {
        assertEquals(5.0, Exercises.absoluteValue(-5));
    }
    
    public void testis01()
    {
        assertEquals(true, Exercises.is0(0));
    }
    
    public void testGetOrderTotal1()
    {
        assertEquals(37.95, Exercises.getOrderTotal(1,1));
    }

}

public class HappyNumbersTester extends junit.framework.TestCase
{
    private HappyNumbers fwhn1;

    
    
    public void testHappyNumbers1()
    {
        fwhn1 = new HappyNumbers();
        assertEquals(true, fwhn1.isHappy(496));
    }
    
    public void testHappyNumbers2()
    {
        fwhn1 = new HappyNumbers();
        assertEquals(false, fwhn1.isHappy(2));
    }
    
    
	
}
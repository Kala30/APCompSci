public class QueueTester extends junit.framework.TestCase
{
    private Queue funWithQ1;

    public void testQueuesLab1()
    {
        Queue funWithQ1 = new QueuesLab();
        assertEquals("The queue is empty.", funWithQ1.removeFromQueue());
    }
    
    
    
    public void testQueuesLab2()
    {
        Queue funWithQ1 = new QueuesLab();
        funWithQ1.addToQueue("Bob Johnson");
        funWithQ1.addToQueue("Alice Stevenson");
        funWithQ1.addVIPToQueue("Mr. Important");
        assertEquals("Mr. Important", funWithQ1.removeFromQueue());
    }
	
}
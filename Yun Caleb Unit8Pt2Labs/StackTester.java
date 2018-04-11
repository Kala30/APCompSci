public class StackTester extends junit.framework.TestCase
{
    private Stack funWithS1;

    public void testStacksLab1()
    {
        Stack funWithS1 = new StacksLab();
        assertEquals("The stack is empty.", funWithS1.pop());
    }
    
   
    
   public void testStacksLab2()
    {
        Stack funWithS1 = new StacksLab();
        funWithS1.push("Bob Johnson");
        funWithS1.push("Alice Stevenson");
        assertEquals("Alice Stevenson", funWithS1.peek());
        assertEquals("Alice Stevenson", funWithS1.pop());
        assertEquals("Bob Johnson", funWithS1.peek());
        assertEquals("Bob Johnson", funWithS1.pop());
        assertEquals("The stack is empty.", funWithS1.pop());
    }
	
}
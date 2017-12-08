public class CrapsGameTester extends junit.framework.TestCase
{ 
  
    ////////////////////////////////////////////////////////////////////////////////////////
    private CrapsGame crapsGame1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        crapsGame1 = new CrapsGame();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testCrapsGame1()
    {
        assertEquals(1, crapsGame1.processRoll(7));
    }

    public void testCrapsGame2()
    {
        assertEquals(-1, crapsGame1.processRoll(2));
    }

    public void testCrapsGame3()
    {
        crapsGame1.processRoll(5);
        crapsGame1.processRoll(2);
        assertEquals(5, crapsGame1.getPoint());
    }
}

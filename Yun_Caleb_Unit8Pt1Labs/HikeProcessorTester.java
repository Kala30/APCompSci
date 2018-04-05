public class HikeProcessorTester extends junit.framework.TestCase
{
    private HikeProcessor hp1;

    protected void setUp()
    {
        hp1 = new HikeProcessor();
    }

    public void testBobHikeDifficulty()
    {
        int[] a = {0, 1, 2, 3, 5, 5, 2, 2, 3, 3, 3, 4, 0};
        assertEquals(14, hp1.bobHikeDifficulty(a));
    }

    public void testSteveHikeDifficulty()
    {
        int[] a = {0, 1, 0, 1, 0, 1, 2, 3, 4, 1, 0};
        assertEquals(3, hp1.steveHikeDifficulty(a));
    }

}
public class ArrayProcessorTester extends junit.framework.TestCase
{
    private int[] numList = {3, 1, 5, 5, 5, 7, 5, 5, 5, 5, 11, 9, 5, 5};
    private ArrayProcessor arrayPro1;

    protected void setUp()
    {
        arrayPro1 = new ArrayProcessor(numList);
    }

    public void testFindIndexOf1()
    {
        assertEquals(5, arrayPro1.findIndexOf(7));
    }

    public void testGetLargest()
    {
        assertEquals(11, arrayPro1.getLargest());
    }

    public void testArrayGetSmallest()
    {
        assertEquals(1, arrayPro1.getSmallest());
    }

    public void testArrayGetTotal()
    {
        assertEquals(76, arrayPro1.getTotal());
    }

    public void testFindLongestBlock1()
    {
        assertEquals(4, arrayPro1.findLongestBlock(5));
    }

    public void testFindNumberOf1()
    {
        assertEquals(1, arrayPro1.findNumberOf(7));
    }

}

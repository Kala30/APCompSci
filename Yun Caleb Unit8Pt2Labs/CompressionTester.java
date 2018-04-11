import java.util.*;
public class CompressionTester extends junit.framework.TestCase
{
    private Compression comp1;
    private int[] list1 = {1, 2, 2, 2, 3};
    private int[] list2 = {1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1};

    protected void setUp()
    {
        comp1 = new Compression();
    }

    public void testCompress1()
    {
        assertEquals("[1]1[3]2[1]3", comp1.compress(list1));
    }

    
    public void testExpand1()
    {
        int[] expectedresult = {3, 3, 7, 7, 7};
        int[] result = comp1.expand("[2]3[3]7");
        for (int i = 0; i < expectedresult.length; i++) {
            assertEquals(expectedresult[i], result[i]);
        }
    }

}

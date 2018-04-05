public class TwoDimArrayTester extends junit.framework.TestCase
{
    private int[][] matrix1 = { {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8} };

    private int[][] matrix2 = { {1, 2, 3},
            {4, 5, 6},
            {1, 1, 2} };

    private int[][] matrix3 = { {1, 2, 3},
            {4, 5, 6} };

    public void testisSquare1()
    {
        TwoDimArrayProcessor tdap = new TwoDimArrayProcessor(matrix2);
        assertEquals(true, tdap.isSquare());
    }


    public void testGetTotal1()
    {
        TwoDimArrayProcessor tdap = new TwoDimArrayProcessor(matrix2);
        assertEquals(25, tdap.getTotal());
    }


    public void testFindNumberOf1()
    {
        TwoDimArrayProcessor tdap = new TwoDimArrayProcessor(matrix2);
        assertEquals(3, tdap.findNumberOf(1));
    }


    public void testIsMagicSquare1()
    {
        TwoDimArrayProcessor tdap = new TwoDimArrayProcessor(matrix1);
        assertEquals(true, tdap.isMagicSquare());
    }

}
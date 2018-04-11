import java.io.*;

public class IndexMakerTester extends junit.framework.TestCase
{
    private DocumentIndex document1;

    protected void setUp()
    {
        document1 = new DocumentIndex();
    }

    public void testIndexMaker1()
    {
        IndexMaker indexMak1 = null;
        try {indexMak1 = new IndexMaker();
             assertEquals("A 12, 14, 15", indexMak1.getIndexLine(0));}
        catch (IOException blah) {}
        finally {}
        
    }

    public void testIndexMaker2()
    {
        IndexMaker indexMak2 = null;
        try {indexMak2 = new IndexMaker();
             assertEquals("FISH 1, 2, 3, 4, 6, 7, 8, 9, 16", indexMak2.getIndexLine(5));}
        catch (IOException blah) {}
        finally {}
    }
    
    public void testIndexMaker3()
    {
        IndexMaker indexMak3 = null;
        try {indexMak3 = new IndexMaker();
             assertEquals("ARE 16", indexMak3.getIndexLine(1));}
        catch (IOException blah) {}
        finally {}
    }
  
}
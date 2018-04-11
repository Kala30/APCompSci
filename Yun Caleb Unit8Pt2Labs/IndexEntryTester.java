public class IndexEntryTester extends junit.framework.TestCase
{
    private IndexEntry indexEnt1;

    public void testIndexEntry1()
    {
        indexEnt1 = new IndexEntry("blah");
        indexEnt1.add(5);
        assertEquals("BLAH 5", indexEnt1.toString());
    }

    public void testIndexEntry2()
    {
        indexEnt1 = new IndexEntry("blah");
        indexEnt1.add(5);
        indexEnt1.add(8);
        assertEquals("BLAH 5, 8", indexEnt1.toString());
    }

    public void testIndexEntry3()
    {
        indexEnt1 = new IndexEntry("blah");
        indexEnt1.add(5);
        indexEnt1.add(5);
        indexEnt1.add(8);
        assertEquals("BLAH 5, 8", indexEnt1.toString());
    }
}
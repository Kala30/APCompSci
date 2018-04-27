public class AMLSTester1 extends junit.framework.TestCase
{
    private Book book1;
    private Video video1;
    private CD cD1;
    private VideoGame videoGam1;
    private BoardGame boardGam1;
    private MediaCollection mediaCollection1;

    /**
     * Default constructor for test class LabTester1
     */
    public AMLSTester1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        book1 = new Book("Fahrenheit 451", "Don't burn this book", "Ray Bradbury");
        video1 = new Video("Crouching Tiger, Hidden Dragon", "Mandarin with English subtitles", "Ang Lee");
        cD1 = new CD("Kind of Blue", "It's kind of blue", "Miles Davis");
        videoGam1 = new VideoGame("Starcraft", "Blizzard rules", "Single or Multiplayer", "Windows PC");
        boardGam1 = new BoardGame("Chess", "Not just for nerds anymore!", "Two only");
        mediaCollection1 = new MediaCollection();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testMediaCollection1()
    {
        assertEquals("Title: Fahrenheit 451\nComment: Don't burn this book\nAuthor: Ray Bradbury", book1.toString());
        assertEquals("Title: Kind of Blue\nComment: It's kind of blue\nArtist: Miles Davis", cD1.toString());
        assertEquals("Title: Crouching Tiger, Hidden Dragon\nComment: Mandarin with English subtitles\nDirector: Ang Lee", video1.toString());
        assertEquals("Title: Starcraft\nComment: Blizzard rules\nNumber of Players: Single or Multiplayer\nPlatform: Windows PC", videoGam1.toString());
        assertEquals("Title: Chess\nComment: Not just for nerds anymore!\nNumber of Players: Two only", boardGam1.toString());
    }

    public void testShowAllLongDescriptions()
    {
        MediaCollection mediaCollectionTest = new MediaCollection();
        mediaCollectionTest.addItem(book1);
        mediaCollectionTest.addItem(cD1);
        mediaCollectionTest.addItem(video1);
        mediaCollectionTest.addItem(videoGam1);
        mediaCollectionTest.addItem(boardGam1);
        mediaCollectionTest.showAllLongDescriptions();
    }

    public void testShowAllShortDescriptions()
    {
        MediaCollection mediaCollectionTest = new MediaCollection();
        mediaCollectionTest.addItem(book1);
        mediaCollectionTest.addItem(cD1);
        mediaCollectionTest.addItem(video1);
        mediaCollectionTest.addItem(videoGam1);
        mediaCollectionTest.addItem(boardGam1);
        mediaCollectionTest.showAllShortDescriptions();
    }

}


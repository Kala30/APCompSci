import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{

  //  Creates an empty DocumentIndex with the default
  // initial capacity.
  public DocumentIndex()
  {
    super();
  }


  //  Creates an empty DocumentIndex with a given
  //  initial capacity.
  public DocumentIndex(int initialCapacity)
  {
    super(initialCapacity);
  }


  //  If word is not yet in this DocumentIndex,
  //  creates a new IndexEntry for word, and inserts
  //  it into this list in alphabetical order, using
  //  foundOrInserted as a helper method;
  //  adds num to this word's IndexEntry by calling
  //  its add(num) method.
  public void addWord(String word, int num)
  {
    // your code here
  }


  //  For each word in str, calls addWord(word, num)
  //  if the length of the word is > 0.
  public void addAllWords(String str, int num)
  {
    // your code here
  }


  // Tries to find an IndexEntry with a given word in this
  // DocumentIndex.  If not found, inserts a new IndexEntry for
  // word at the appropriate place (in lexicographical order).
  // Returns the index of the found or inserted IndexEntry
  private int foundOrInserted(String word)
  {
    // your code here
  }
}

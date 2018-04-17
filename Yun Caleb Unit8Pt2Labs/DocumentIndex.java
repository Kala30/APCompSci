import java.util.ArrayList;

/**
 * 5. Creating an Index for a Document
 * 
 * @author Caleb Yun
 * @version 4/16/2018
 */
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
        int i = foundOrInserted(word.toUpperCase());
        get(i).add(num);
    }

    //  For each word in str, calls addWord(word, num)
    //  if the length of the word is > 0.
    public void addAllWords(String str, int num)
    {
        String[] words = str.split("\\W+");
        for (String word : words) {
            if (!word.equals(""))
            addWord(word, num);
        }
    }

    // Tries to find an IndexEntry with a given word in this
    // DocumentIndex.  If not found, inserts a new IndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    private int foundOrInserted(String word)
    {
        for (int i = 0; i < this.size(); i++) {
            //int before = word.compareTo(this.get(i).getWord());
            int isAfter = word.compareTo(this.get(i).getWord()); // Positive when word in list is after
            if (this.get(i).getWord().compareTo(word) == 0) {
                return i;
            } else if (isAfter < 0) { // "word" is between i and i+1
                this.add(i, new IndexEntry(word));
                return i;
            }
        }
        this.add(new IndexEntry(word));
        return this.size()-1;
    }
}

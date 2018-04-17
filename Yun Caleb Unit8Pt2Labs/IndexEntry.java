import java.util.ArrayList;

/**
 * 5. Creating an Index for a Document
 * 
 * @author Caleb Yun
 * @version 4/16/2018
 */
public class IndexEntry
{
    private String word;
    private ArrayList<Integer> numsList;

    // Constructs an IndexEntry for a given word
    // (converted to upper case); sets numsList
    // to an empty ArrayList.
    public IndexEntry(String word)
    {
        this.word = word.toUpperCase();
        numsList = new ArrayList<Integer>();
    }

    // Returns the word of this IndexEntry object.
    public String getWord()
    {
        return word;
    }

    // If num is not already in the list, adds num
    // at the end of this IndexEntry's list
    // of numbers.  If num is there, do nothing.
    public void add(int num)
    {
        if (!numsList.contains(num))
            numsList.add(num);
    }

    // Converts this IndexEntry into a string in the
    // following format: the word followed by a space, followed by
    // numbers separated by a comma and a space.
    public String toString()
    {
        String result = word + " ";
        for (int i = 0; i < numsList.size(); i++) {
            result += numsList.get(i);
            if (i != numsList.size()-1)
            result += ", ";
        }
        return result;
    }
}

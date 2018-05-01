
/**
 * Poem Abstract Class
 *
 * @author Caleb Yun
 * @version 4/30/2018
 */
public abstract class Poem
{
    // Returns the number of lines in the poem
    public abstract int numLines();
    
    // Returns the number of syllables in the k-th line
    public abstract int getSyllables(int k);
    
    // Shows the rhythm of the poem
    public void printRhythm()
    {
        for (int i = 0; i < numLines(); i++) {
            for (int j = 0; j < getSyllables(i+1); j++) {
                if (i != 0)
                    System.out.print("-");
                System.out.print("ta");
            }
            System.out.print("\n");
        }
    }
}

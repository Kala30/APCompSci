
/**
 * Haiku Class
 *
 * @author Caleb Yun
 * @version 4/30/2018
 */
public class Haiku extends Poem
{
    public int numLines()
    {
        return 3;
    }
    
    public int getSyllables(int k)
    {
        if (k == 1 || k == 3)
            return 5;
        else if (k == 2)
            return 7;
        else
            return 0;
    }
}


/**
 * Limerick Class
 *
 * @author Caleb Yun
 * @version 4/30/2018
 */
public class Limerick extends Poem
{
    public int numLines()
    {
        return 5;
    }
    
    public int getSyllables(int k)
    {
        if (k == 1 || k == 2 || k == 5)
            return 5;
        else if (k == 3 || k == 4)
            return 7;
        else
            return 0;
    }
}

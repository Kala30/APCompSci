
/**
 * Bob and Steve, The Park Rangers
 * 
 * @author Caleb Yun
 * @version 3/29/2018
 */
public class HikeProcessor
{
    /**
     * Returns the difficulty of a hike.
     * Total elevation change.
     */
    public static int bobHikeDifficulty(int[] hike)
    {
        int difficulty = 0;
        for (int i = 1; i < hike.length; i++)
        {
            difficulty += Math.abs(hike[i] - hike [i-1]);
        }
        return difficulty;
    }
    
    /**
     * Returns the difficulty of a hike.
     * Largest elevation change.
     */
    public static int steveHikeDifficulty(int[] hike)
    {
        int difficulty = 0;
        for (int i = 1; i < hike.length; i++)
        {
            if (Math.abs(hike[i] - hike [i-1]) > difficulty)
                difficulty = Math.abs(hike[i] - hike [i-1]);
        }
        return difficulty;
    }
}

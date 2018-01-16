
/**
 * U5D4 Coding Exercise #5
 *
 * @author Caleb Yun
 * @version 1/9/2018
 */
public class SoccerTeam
{
    int wins;
    int losses;
    int ties;
    
    private static int totalGames;
    private static int totalGoals;
    
    public void played(SoccerTeam other, int myScore, int otherScore)
    {
        totalGames++;
        totalGoals += myScore + otherScore;
        
        if (myScore > otherScore) // Win
        {
            this.wins++;
            other.losses++;
        }
        else if (myScore < otherScore) // Loss
        {
            other.wins++;
            this.losses++;
        }
        else // Tie
        {
            this.ties++;
            other.ties++;
        }
    }
    
    public void reset()
    {
        wins = 0;
        losses = 0;
        ties = 0;
    }
    
    public static void startTournament()
    {
        totalGames = 0;
        totalGoals = 0;
    }
    
    public int getPoints()
    {
        return (wins * 2) + (ties);
    }
    
    public static int getTotalGames()
    {
        return totalGames;
    }
    
    public static int getTotalGoals()
    {
        return totalGoals;
    }
}

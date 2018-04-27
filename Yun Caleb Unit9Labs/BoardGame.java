
/**
 * BoardGame Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public class BoardGame extends Game
{
    public BoardGame(String title, String comment, String numPlayers) {
        super(title, comment, numPlayers);
    }
    
    public String getShortDescription() {
        return "Board Game: " + getTitle();
    }
}

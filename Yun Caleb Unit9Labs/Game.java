
/**
 * Game Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public abstract class Game extends Item
{    
    private String numPlayers;
    
    public Game(String title, String comment, String numPlayers) {
        super(title, comment);
        this.numPlayers = numPlayers;
    }
    
    public String toString() {
        return super.toString() + "\nNumber of Players: " + numPlayers;
    }
}


/**
 * VideoGame Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public class VideoGame extends Game
{
    private String platform;
    
    public VideoGame(String title, String comment, String numPlayers, String platform) {
        super(title, comment, numPlayers);
        this.platform = platform;
    }
    
    public String getShortDescription() {
        return "Video Game: " + getTitle();
    }
    
    public String toString() {
        return super.toString() + "\nPlatform: " + platform;
    }
}

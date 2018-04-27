
/**
 * CD Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public class CD extends Item
{
    private String artist;
    
    public CD(String title, String comment, String artist) {
        super(title, comment);
        this.artist = artist;
    }
    
    public String getShortDescription() {
        return "CD: " + getTitle();
    }
    
    public String toString() {
        return super.toString() + "\nArtist: " + artist;
    }
}

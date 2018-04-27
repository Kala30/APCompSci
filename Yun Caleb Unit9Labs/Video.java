
/**
 * Write a description of class Video here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Video extends Item
{
    private String director;
    
    public Video(String title, String comment, String director) {
        super(title, comment);
        this.director = director;
    }
    
    public String getShortDescription() {
        return "Video: " + getTitle();
    }
    
    public String toString() {
        return super.toString() + "\nDirector: " + director;
    }
}

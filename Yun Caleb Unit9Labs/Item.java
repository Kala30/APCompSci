
/**
 * Item Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public abstract class Item
{
    private String title;
    private String comment;
    
    public Item(String title, String comment) {
        this.title = title;
        this.comment = comment;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String toString() {
        return "Title: " + title + "\nComment: " + comment;
    }
    
    public abstract String getShortDescription();
}

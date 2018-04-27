
/**
 * Book Class
 * 
 * @author Caleb Yun
 * @version 4/27/2018
 */
public class Book extends Item
{
    private String author;
    
    public Book(String title, String comment, String author) {
        super(title, comment);
        this.author = author;
    }
    
    public String getShortDescription() {
        return "Book: " + getTitle();
    }
    
    public String toString() {
        return super.toString() + "\nAuthor: " + author;
    }
}

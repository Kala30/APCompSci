
/**
 * Assignment #2: Diploma Class
 *
 * @author Caleb Yun
 * @version 4/24/2018
 */
public class Diploma
{
    private String name;
    private String course;
    
    public Diploma(String name, String course)
    {
        this.name = name;
        this.course = course;
    }
    
    public String toString()
    {
        return "This certifies that\n" +
                name +
                "\nhas completed a course in " + course;
    }
}

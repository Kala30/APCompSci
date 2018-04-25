
/**
 * Write a description of class DiplomaWithHonors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiplomaWithHonors extends Diploma
{
    public DiplomaWithHonors(String name, String course)
    {
        super(name, course);
    }
    
    public String toString()
    {
        return super.toString() + "\n *** with honors ***";
    }
}

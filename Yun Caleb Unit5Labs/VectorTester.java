
/**
 * Write a description of class VectorTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VectorTester
{
    public static void main(String[] args)
    {
        Vector v1 = new Vector(12, 20);
        System.out.println(v1);
        
        Vector v2 = new Vector(25, 60);
        System.out.println(v2);
        
        Vector v3 = v1.addVector(v2);
        System.out.println(v3);
    }
}

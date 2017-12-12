
/**
 * Test Fraction Class
 * 
 * @author Caleb Yun
 * @version Created on 12/12/2017
 */
public class FractionTesterClass
{
    public static void testConstructors()
    {
        Fraction f1 = new Fraction(); // 1st constructor: 0/1
        Fraction f2 = new Fraction(7); // 2nd constructor: 7/1
        Fraction f3 = new Fraction(12,-20); // 3rd constructor: 12/-20
        Fraction f4 = new Fraction(f3); // 4th constructor: 12/-20
        Fraction f5 = new Fraction(1,0);
        
        System.out.println(f1.toString());
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}

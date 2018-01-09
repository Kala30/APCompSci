
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
    
    public static void testArithmetic()
    {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction sum = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sum);
        Fraction product = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + product);
        
        int m = 5;
        sum = f1.add(m);
        System.out.println(f1 + " + " + m + " = " + sum);
        product = f1.multiply(m);
        System.out.println(f1 + " * " + m + " = " + product);
    }
    
    public static void testValues()
    {
        Fraction f1 = new Fraction(1, 5);
        System.out.println(f1 + " = " + f1.getValue());
        
        Fraction f2 = new Fraction(1, 6);
        System.out.println(f2 + " = " + f2.getValue());
        
        double d1 = 0.5;
        System.out.println(d1 + " = " + Fraction.valueOf(d1));
        
        double d2 = f2.getValue();
        System.out.println(d2 + " = " + Fraction.valueOf(d2));
    }
}

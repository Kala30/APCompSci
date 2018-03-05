
/**
 * Tester for Num class
 * 
 * @author Caleb Yun
 * @version 3/5/2018
 */
public class NumTester
{
    /**
     * Test == and equals() methods.
     */
    public static void testEquals()
    {
        Num num1 = new Num(3);
        Num num2 = new Num(3);
        
        System.out.println("num1 is " + num1); 
        System.out.println("num2 is " + num2);
        System.out.println("num1 == num2 is " + (num1 == num2)); // false
        System.out.println("num1.equals(num2) is " + num1.equals(num2)); // true
    }
    
    /**
     * Test isEqualTo() method. (Deprecated)
     */
    public static void testIsEqualTo()
    {
        testEquals();
        Num num1 = new Num(3);
        Num num2 = new Num(3);
        //System.out.println("num1.isEqualTo(num2) is " + num1.isEqualTo(num2)); // true
    }
    
    /**
     * Test compareTo() method.
     */
    public static void testCompareTo()
    {
        Num num1 = new Num(3);
        Num num2 = new Num(4);
        
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num1.compareTo(num2): " + num1.compareTo(num2));
        System.out.println("num2.compareTo(num1): " + num2.compareTo(num1));
        
    }
}

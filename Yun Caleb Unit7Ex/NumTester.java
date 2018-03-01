
/**
 * Write a description of class NumTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumTester
{
    public static void testEquals()
    {
        Num num1 = new Num(3);
        Num num2 = new Num(3);
        
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1.equals(num2) is " + num1.equals(num2));
    }
}

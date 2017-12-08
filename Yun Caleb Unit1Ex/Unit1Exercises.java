
/**
 * Unit 1 in-class exercises
 * 
 * @author Caleb Yun/Henry Lee
 * @version 9/19/17
 */
public class Unit1Exercises
{
    public static void main(String[] args)
    {
        drawFace();
        nameInBox();
        drawDiamond();
        drawInitials();
    }

    public static void drawFace()
    {
        System.out.println("      XXXX  ");
        System.out.println("   X       X");
        System.out.println(" ((   o o   ))");
        System.out.println("   |   V   |");
        System.out.println("   |  ===  |");
        System.out.println("     -----");
    }

    public static void nameInBox()
    {
        System.out.println("+--------+");
        System.out.println("| Dragon |");
        System.out.println("+--------+");
    }

    public static void drawDiamond() 
    {
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println(" *******");
        System.out.println("  *****");
        System.out.println("   ***");
        System.out.println("    *");
    }

    public static void drawInitials()
    {
        System.out.println(" CCCCCCCCCCCCC   YY         YY");
        System.out.println("CCCCCCCCCCCCCCC   YY       YY");
        System.out.println("CCC          CC    YY     YY");
        System.out.println("CCC                 YY   YY");
        System.out.println("CCC                  YY YY");
        System.out.println("CCC                   YYY");
        System.out.println("CCC          CC       YYY");
        System.out.println("CCCCCCCCCCCCCCC       YYY");
        System.out.println(" CCCCCCCCCCCCC        YYY");
    }
}

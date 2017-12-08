import java.util.Scanner;

/**
 * Unit 2 Examples
 * 
 * @author Caleb Yun
 * @version 9/25/17
 */
public class Examples
{
    public static void printToTerminal() {
        System.out.print("Hello ");
        System.out.print("there");
        System.out.println("!");
        System.out.print("Hiya");
    }

    public static void stringConcat() {
        System.out.println("25 and 45 concatenated: " + 25 + 45);
        System.out.println("25 and 45 added: " + (25 + 45));
    }
    
    public static void escapeChars() {
        System.out.println("Hello,\nHello There!\n\nHello\n\"Hello There\"\n\n\'Hello\'\nHello\\There");
    }
    
    public static void echo()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String message = scan.nextLine();
        System.out.println("Your enter: \"" + message + "\"");
    }
}
import javax.swing.JFrame;
import java.util.Scanner;


public class ColorTester
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Value for red: ");
        int red = input.nextInt();

        System.out.print("Value for green: ");
        int green = input.nextInt();

        System.out.print("Value for blue: ");
        int blue = input.nextInt();

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Exercises.bestMatch(red, green, blue));
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

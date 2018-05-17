import java.applet.Applet;
import java.awt.*;

/**
 * Applet Exercises
 * 
 * @author Caleb Yun
 * @version 5/17/2018
 */
public class Exercises extends Applet
{
    public void paint(Graphics g) {
        Graphics2D page = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        page.setRenderingHints(rh);

        final int MID = 150;
        final int TOP = 50;

        drawCircle(page, MID-50, TOP+50, 50, Color.blue, 2);
        drawCircle(page, MID, TOP+50, 50, Color.black, 2);
        drawCircle(page, MID+50, TOP+50, 50, Color.red, 2);
        drawCircle(page, MID-50, TOP+50, 50, Color.yellow, 2);
        drawCircle(page, MID-25, TOP+75, 50, Color.green, 2);
        drawCircle(page, MID+25, TOP+75, 50, Color.blue, 2);
    }

    public void drawCircle(Graphics page, int x, int y, int radius, Color color, int stroke) {
        page.setColor(color);
        page.fillOval(x, y, radius, radius);
        page.setColor(Color.white);
        page.fillOval(x+stroke, y+stroke, radius-(2*stroke), radius-(2*stroke));
    }
}

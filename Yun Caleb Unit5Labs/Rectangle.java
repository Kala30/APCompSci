
/**
 * Rectangle Class
 * 
 * @author Grant Cai, Caleb Yun
 * @version 1/11/2018
 */
public class Rectangle
{
    private int height;
    private int width;
    
    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    public Rectangle(int length)
    {
        this(length, length);
    }
    
    public Rectangle()
    {
        this(1,1);
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public boolean isSquare()
    {
        return height == width;
    }
    
    public void quadratize()
    {
        int area = width * height;
        int length = (int) Math.round(Math.sqrt(area));
        height = length;
        width = length;
    }
}

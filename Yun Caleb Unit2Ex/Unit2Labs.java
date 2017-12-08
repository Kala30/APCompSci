import java.util.Random;

/**
 * Unit 2 Labs
 * 
 * @author Caleb Yun
 * @version 10/16/2017
 */

public class Unit2Labs
{
    public static void main(String[] args)
    {
        System.out.println(areaOfPolygon(3, 5)); // 10.83
        System.out.println(areaOfPolygon(4, 2)); // 4.0
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.println(phoneNumber());
        }
    }

    public static double areaOfPolygon(double numSides, double sideLength)
    {
        double area = (Math.pow(sideLength, 2) * numSides) / (4 * Math.tan(Math.PI / numSides));
        return Math.round(area * 100) / 100.0;
    }

    public static String phoneNumber()
    {
        Random randGen  = new Random();
        String result = String.format("%03d", randGen.nextInt(900) + 100) + "-" +
            String.format("%03d", randGen.nextInt(743)) + "-" +
            String.format("%04d", randGen.nextInt(10000));

        return result;
    }
}
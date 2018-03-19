
/**
 * Write a description of class Array2DExercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2DExercises
{
    /**
     * Prints out seating chart with traditional for loop.
     */
    public static void seatingChart()
    {
        String[][] chart = { {"Jan", "Ben", "Sue", "Ray"},
                {"Ted", "May", "Eva", "Sam"},
                {"Luz", "Dan", "Joe", "Roz"} };

        for (int i = 0; i < chart.length; i++)
        {
            for (int j = 0; j < chart[i].length; j++)
            {
                System.out.print(chart[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    /**
     * Prints out seating chart with for each loop.
     */
    public static void seatingChartForEach()
    {
        String[][] chart = { {"Jan", "Ben", "Sue", "Ray"},
                {"Ted", "May", "Eva", "Sam"},
                {"Luz", "Dan", "Joe", "Roz"} };

        for (String[] row : chart)
        {
            for (String str : row)
            {
                System.out.print(str + "\t");
            }
            System.out.print("\n");
        }
    }
    
    /**
     * Returns the sum of a specified row in arr.
     */
    public static int rowSum(int[][] arr, int row)
    {
        int sum = 0;
        for (int num : arr[row]) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Returns the sum of the elements in column col of arr.
     */
    public static int columnSum(int[][] arr, int col)
    {
        int sum = 0;
        for (int row : arr) {
            if (col < row.length)
                sum += row[col];
        }
        return sum;
    }
    
    /**
     * Returns the value of the largest positive element in
     * the 2D array m, or 0, if all its elements are negative.
     */
    private static double positiveMax(double[][] m)
}

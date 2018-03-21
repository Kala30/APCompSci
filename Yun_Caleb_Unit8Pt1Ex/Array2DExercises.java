
/**
 * Write a description of class Array2DExercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2DExercises
{
    public static void main(String[] args)
    {
        print2D(pascalTriangle(10));
    }
    
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
        for (int[] row : arr) {
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
    {
        double largest = 0;
        for (double[] row : m)
        {
            for (double num : row)
            {
                if (num > 0 && num > largest)
                    largest = num;
            }
        }

        return largest;
    }

    /**
     * Returns true if m1 "covers" m2, false otherwise.
     * Precondition: m1 and m2 have the same dimensions.
     */
    private static boolean covers(double[][] m1, double[][] m2)
    {
        int count = 0;
        for (int i = 0; i < m1.length; i++)
        {
            for (int j = 0; j < m1[i].length; j++)
            {
                if (m1[i][j] != m2[i][j])
                    count++;
                if (count > (m1.length * m1[i].length)/2)
                    return false;
            }
        }
        return true;
    }
    
    /**
     * Pascal's Triangle
     */
    public static int[][] pascalTriangle(int n)
    {
        int[][] triangle = new int[n][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0 || i == j)
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }

    /**
     * Returns a 12x12 array filled with all rows of multiplication tables up to 12.
     */
    public static int[][] multTable()
    {
        int[][] table = new int[12][12];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }
        return table;
    }

    /**
     * Prints a 2D array with for-each loops.
     */
    public static void print2DForEach()
    {
        int[][] toReturn = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int[] row : toReturn)
        {
            for (int column : row)
            {
                System.out.print(column + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void print2D(int[][] arr) {
        for (int[] row : arr)
        {
            for (int column : row)
            {
                System.out.print(column + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void multTable2(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(((i+1) * (j+1)) + "\t");
            }
            System.out.print("\n");
        }
    }
}

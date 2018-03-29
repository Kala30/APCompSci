
/**
 * Two-Dimensional Array Processing
 * 
 * @author Caleb Yun
 * @version 3/29/2018
 */
public class TwoDimArrayProcessor
{
    private int[][] numlist;

    public TwoDimArrayProcessor(int[][] numlist)
    {
        this.numlist = numlist;
    }

    /**
     * Returns true if array is square.
     */
    public boolean isSquare()
    {
        int rows = numlist.length;
        for (int i = 0; i < rows; i++)
        {
            if (numlist[i].length != rows)
                return false;
        }
        return true;
    }

    /**
     * Returns the total of every number in the matrix.
     */
    public int getTotal()
    {
        int sum = 0;
        for (int row : numlist) {
            for (int col : row) {
                sum += col;
            }
        }
        return sum;
    }

    /**
     * Returns the number of times num appears in the matrix.
     */
    public int findNumberOf(int num)
    {
        int count = 0;
        for (int row : numlist) {
            for (int col : row) {
                if (col == num)
                    count++;
            }
        }
        return count;
    }

    /**
     * Returns true if numlist is a magic square.
     */
    public boolean isMagicSquare()
    {
        if (!this.isSquare())
            return false;
        int sum = 0;
        // Rows
        for (int i = 0; i < numlist.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < numlist.length; j++) {
                rowSum += numlist[i][j];
            }
            if (i == 0)
                sum = rowSum
            else if (rowSum != sum)
                return false;
        }
        // Columns
        for (int i = 0; i < numlist.length; i++) {
            int colSum = 0;
            for (int j = 0; j < numlist.length; j++) {
                colSum += numlist[j][i];
            }
            if (colSum != sum)
                return false;
        }
        
        // Diagonals
        int diaSum = 0;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (i == j)
                    diaSum = numlist[i][j];
            }        
        }
        if (daiSum != sum)
                return false;
        for (int i = 0; i < numlist.length; i++) {
            int diaSum = 0;
            for (int j = 0; j < numlist.length; j++) {
                if (i == j)
                    diaSum = numlist[i][j];
            }
        }
        if (daiSum != sum)
                return false;
        return true;
    }
}

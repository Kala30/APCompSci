
/**
 * Array Processing
 * 
 * @author Caleb Yun
 * @version 3/29/2018
 */
public class ArrayProcessor
{
    private int[] numlist;
    
    public ArrayProcessor(int[] numlist)
    {
        this.numlist = numlist;
    }
    
    /**
     * Return the total of every number in the list.
     */
    public int getTotal()
    {
        int sum = 0;
        for (int num : numlist) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Returns the largest number in the list.
     */
    public int getLargest()
    {
        int largest = numlist[0];
        for (int i = 1; i < numlist.length; i++) {
            if (numlist[i] > largest)
                largest = numlist[i];
        }
        return largest;
    }
    
    /**
     * Returns the smallest number on the list.
     */
    public int getSmallest()
    {
        int smallest = numlist[0];
        for (int i = 1; i < numlist.length; i++) {
            if (numlist[i] < smallest)
                smallest = numlist[i];
        }
        return smallest;
    }
    
    /**
     * Takes in one int parameter and
     * returns the index of the first occurrence of that value.
     * If that value does not occur on the list, return -1.
     */
    public int findIndexOf(int num)
    {
        for (int i = 0; i < numlist.length; i++)
        {
            if (numlist[i] == num)
                return i;
        }
        return -1;
    }
    
    /**
     * Takes in one int parameter and
     * returns the number of times that value occurs on the list.
     */
    public int findNumberOf(int num)
    {
        int count = 0;
        for (int element : numlist) {
            if (num == element)
                count++;
        }
        return count;
    }
    
    /**
     * Takes in one integer parameter and
     * returns the size of the largest consecutive block of that value.
     */
    public int findLongestBlock(int num)
    {
        int longestLength = 0;
        int currentLength = 0;
        for (int i = 1; i < numlist.length; i++)
        {
            if (numlist[i] == num && numlist[i - 1] == num) {
                if (currentLength == 0)
                    currentLength = 1;
                currentLength++;
                if (currentLength > longestLength)
                    longestLength = currentLength;
            } else
                currentLength = 0;
        }
        
        return longestLength;
    }
}

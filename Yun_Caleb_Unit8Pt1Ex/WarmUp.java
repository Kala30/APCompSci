
/**
 * Warm Up
 * 
 * @author Caleb Yun 
 * @version 3/19/2018
 */
public class WarmUp
{
    /**
     * Adds up all the elements in arr and returns that sum.
     */
    public static int sumArray(int[] arr)
    {
        int sum = 0;
        //for (int i = 0; i < arr.length; i++)
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Returns the number of negative values in arr.
     */
    public static int findNegatives(int[] arr)
    {
        int count = 0;
        //for (int i = 0; i < arr.length; i++)
        for (int num : arr) {
            if (num < 0)
                count++;
        }
        return count;
    }
    
    /**
     * Returns an array of two elements:
     * The index of the longest word in arr
     * and the length of it.
     */
    public static int[] findLongest(String[] arr)
    {
        int index = 0;
        int length = 0;
        int i = 0;
        //for (int i = 1; i < arr.length; i++)
        for (String str : arr) {
            if (i > 0 && str.length() > arr[i-1].length()) {
                length = str.length();
                index = i;
            }
            i++;
        }
        int[] result = {index, length};
        return result;
    }
}

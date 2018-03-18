import java.util.Arrays;
import java.util.Random;

/**
 * 1-D Arrays Exercises
 *
 * @author Caleb Yun
 * @version 3/13/2018
 */
public class Array1DExercises
{
    public static void fill1DArray()
    {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));
    }

    /**
     * Returns an array of arr1 and arr2 merged together, starting with arr1
     * 
     * @param arr1 First array that will be merged
     * @param arr2 second array that will be merged
     * @return An array containing all values of arr1 and arr2
     */
    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr1.length + arr2.length; i++)
        {
            merged[i] = arr2[i - arr2.length];
        }
        return merged;
    }

    /**
     * Returns arr, but with an inserted value at the given index (will be one element longer)
     * 
     * @param arr The array that we will insert a value into -- Precondition: length > 1
     * @param val The value to be inserted
     * @param index where val will be inserted into -- Precondition: index exists in arr
     * @return array arr
     */
    public static int[] insert(int[] arr, int val, int index)
    {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < index; i++)
        {
            result[i] = arr[i];
        }
        result[index] = val;
        for (int i = index + 1; i < result.length; i++)
        {
            result[i] = arr[i - 1];
        }
        return result;
    }

    /**
     * Takes an int array and swaps the first element with the last.
     * 
     * @param arr Originial array
     * @return Swapped array
     */
    public static void swap(int[] arr)
    {
        int first = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = first;
    }

    /**
     * Returns an array filled with values
     * 1, 2, … , n-1, n, n-1, … , 2, 1.
     */
    public static int[] createWedge(int n)
    {
        int[] result = new int[n + n - 1];
        for (int i = 0; i < n; i++)
        {
            result[i] = i + 1;
        }
        for (int i = n; i < n + n - 1; i++)
        {
            result[i] = n + n - i - 1;
        }
        return result;
    }

    /**
     * 
     */
    public static int getToss()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     * @param numTosses the number of tosses to be recorded
     *          Precondition: numTosses > 0
     * @return an array of  numTosses values
     */
    public static int[] getCubeTosses(int numTosses)
    {
        int[] result = new int[numTosses];
        for (int i = 0; i < numTosses; i++)
        {
            result[i] = getToss();
        }

        return result;
    }

    /** Get the starting index of a longest run of two or more consecutive repeated values in the array values.
     * @param values an array of integer values representing a series of number cube tosses
     *  Precondition: values.length > 0
     * @return  the starting index of a run of maximum size;
     *         -1 if there is no run
     */
    public static int getLongestRun(int[] tosses)
    {
        int startIndex = 0;
        int longestLength = 0;
        int currentLength = 0;
        for (int i = 1; i < tosses.length; i++)
        {
            if (tosses[i] == tosses[i - 1]) {
                if (currentLength == 0) {
                    startIndex = i - 1;
                    currentLength = 1;
                }
                currentLength++;
                if (currentLength > longestLength)
                    longestLength = currentLength;
            } else
                currentLength = 0;
        }
        
        if (longestLength == 0)
            return -1;
        else
            return startIndex;
    }
}

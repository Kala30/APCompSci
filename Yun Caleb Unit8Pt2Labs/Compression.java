import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4. Compression
 *
 * @author Caleb Yun
 * @version 4/16/2018
 */
public class Compression
{
    // Takes in array of int (single digit) and produce formatted string
    public String compress(int[] numberList)
    {
        String compressed = "";
        int count = 1;
        for (int i = 1; i < numberList.length; i++) {
            if (numberList[i] == numberList[i-1])
                count++;
            else {
                compressed += "[" + count + "]" + numberList[i-1];
                count = 1;
            }
        }
        return compressed;
    }

    // Take in the encoded data (string) and return array of int
    public int[] expand (String numberList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start;
        int end;
        for (int i = 0; i < numberList.length(); i++) {
            start = numberList.indexOf("[", i);
            end = numberList.indexOf("]", numberList.indexOf("[", i));
            if (start >= 0) {
                String subList = numberList.substring(start + 1, end);
                int n = Integer.parseInt(subList);
                int num;
                for (int j = 0; j < n; j++) {
                    num = subList.charAt(subList.length()-1);
                    list.add(num);
                }
            }
        }
        
        int[] numArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            numArray[i] = list.get(i);
        return numArray;
    }
}

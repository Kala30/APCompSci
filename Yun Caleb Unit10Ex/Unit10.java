import java.util.Collections;
import java.util.Collections;

/**
 * Write a description of class Unit10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unit10
{
    public static int search(int[] a, int m, int n, int target)
    {
        if (m == n)
            return m;
        else if (m > n)
            return -1;
        else {
            Collections.sort(a);
            int middle = a[(m - n) / 2];
            if (target > middle)
                return search(a, middle, n);
            else if (targe < middle)
                return search(a, m, middle);
            else
                return middle;
        }
    }
}

import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Unit 10 Exercises
 * 
 * @author Caleb Yun
 * @version 5/6/2018
 */
public class Unit10
{
    public static void main(String[] args)
    {
        int[] arr = {3, 1, 5, 10, 6, 9, 2, 8, 4, 7};
        System.out.println("Searching for 5 in 0-9: " + search(arr, 0, 9, 1));
        System.out.println("Searching for 5 in 0-4: " + search(arr, 0, 5, 1));
        System.out.println("Searching for 5 in 5-9: " + search(arr, 5, 9, 1));
    }
    
    public static int search(int[] a, int m, int n, int target)
    {
        if (m == n) {
            if (a[m] == target)
                return m;
            else
                return -1;
        } else {
            Arrays.sort(a);
            int middle = (n + m) / 2;
            if (target > a[middle])
                return search(a, middle, n, target);
            else if (target < a[middle])
                return search(a, m, middle, target);
            else if (target == a[middle])
                return middle;
            else
                return -1;
        }
    }
}

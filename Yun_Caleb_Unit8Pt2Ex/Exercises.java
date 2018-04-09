import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit 8 Part 2 Exercises
 *
 * @author Caleb Yun
 * @version 4/4/2018
 */
public class Exercises
{
    public static void main(String[] args)
    {
        ArrayList list = createList();

        System.out.println(reverse(list));

        Integer[] nums = {1,4,9,16,9,7,4,9,11};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        System.out.println("plusMinus(list) = " + plusMinus(numList));
    }

    public static ArrayList<String> createList()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Frodo");
        list.add("Sam");
        list.add("Merry");
        list.add("Pippin");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Legolas");
        list.add("Gimli");
        System.out.println(list);
        return list;
    }

    public static ArrayList<String> reverse(ArrayList<String> list)
    {
        ArrayList<String> reversed = new ArrayList<String>();
        for (String str : list) {
            reversed.add(0, str);
        }
        return reversed;
    }

    public static int plusMinus(ArrayList<Integer> list)
    {
        int sum = 0;
        int i = 0;
        //for (int i = 0; i < list.size(); i++)
        for (Integer num : list)
        {
            if (i % 2 == 0)
                sum += num;
            else
                sum -= num;
            i++;
        }
        return sum;
    }
    
    // Problem #2
    public static void removeSmallest(ArrayList<Integer> list)
    {
        int smallest = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if ((int)list.get(i) < smallest)
                smallest = i;
        }
        list.remove(smallest);
    }
    
    // Problem #3
    public static void removeDuplicates(ArrayList<String> words)
    {
        int other;
        for (int i = words.size()-1; i >= 0; i--)
        {
            other = words.indexOf(words.get(0));
            if (other != -1)
                words.remove(other);
        }
    }
    
    // Problem #4
    public static void switchPairs(ArrayList<String> list)
    {
        
    }
}

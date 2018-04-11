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

        Integer[] nums = {1,4,9,16,9,7,4,9,11};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //System.out.println("reverse(): " + reverse(list));

        //System.out.println("plusMinus(list): " + plusMinus(numList));

        //removeSmallest(numList)
        //System.out.println("removeSmallest(): " + numList);

        list.add("Gandalf"); list.add("Gandalf"); list.add("Legolas");
        System.out.println(list);
        removeDuplicates(list);
        System.out.println("removeDuplicates(): " + list);

        switchPairs(list);
        System.out.println("switchPairs(): " + list);
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
        list.add("Boromir");
        list.add("Legolas");
        list.add("Gimli");
        System.out.println(list);
        return list;
    }

    // Problem #1
    // Reverses order of elements in an ArrayList
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
    // Removes smallest element in an ArrayList
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
    // Removes duplicate words in an ArrayList
    public static void removeDuplicates(ArrayList<String> words)
    {
        int other;
        for (int i = words.size()-1; i >= 0; i--)
        {
            other = words.indexOf(words.get(i));
            if (other != -1 && other != i)
                words.remove(other);
        }
    }

    // Problem #4
    // Switch pairs in ArrayList
    public static void switchPairs(ArrayList<String> list)
    {
        String temp;
        for (int i = 0; i < list.size(); i += 2) {
            if (i+1 < list.size()) {
                temp = list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, temp);
            }
        }
    }

    // Problem #5
    // Tests if ArrayList<ArrayList<String>> is possible
    public static void testHyp()
    {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        list.add(new ArrayList<String>() {{ add("A"); add("B"); add("C");}});
        list.add(new ArrayList<String>() {{ add("1"); add("2"); add("3");}});
        System.out.println(list);
    }
}

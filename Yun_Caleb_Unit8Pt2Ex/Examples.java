import java.util.ArrayList;

/**
 * Unit 8: ArrayList Examples
 * 
 * @author Caleb Yun
 * @version 4/11/2018
 */
public class Examples
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        
        System.out.println("compareElements(list1,list1): " + compareElements(list1,list1));
        System.out.println("compareElements(list1,list2): " + compareElements(list1,list2));
        System.out.println("compareElements(list2,list1): " + compareElements(list2,list1));
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
    
    public static int compareElements(ArrayList<String> list1, ArrayList<String> list2)
    {
        int result = 0;
        for (int i = 0; i < list1.size(); i++) {
            result += list1.get(i).compareTo(list2.get(i));
        }
        return result;
    }
}

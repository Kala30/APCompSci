import java.util.ArrayList;
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
        ArrayList list = new ArrayList();
        list.add("Frodo");
        list.add("Sam");
        list.add("Merry");
        list.add("Pippin");
        list.add("Aragorn");
        list.add("Gandalf");
        list.add("Legolas");
        list.add("Gimli");
        
        System.out.println(reverse(list));
    }
    
    public static ArrayList<String> reverse(ArrayList<String> list)
    {
        ArrayList<String> reversed = new ArrayList<String>();
        for (String str : list) {
            reversed.add(0, str);
        }
        return reversed;
    }
}

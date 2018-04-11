import java.util.ArrayList;

/**
 * Lab Part #1
 * 
 * @author Caleb Yun
 * @version 4/11/2018
 */
public class QueuesLab implements Queue
{
    private ArrayList<String> list;

    public QueuesLab()
    {
        list = new ArrayList<String>();
    }

    public void addToQueue(String str)
    {
        list.add(str);
    }

    public String removeFromQueue()
    {
        if (list.size() > 0) {
            String str = list.get(0);
            list.remove(0);
            return str;
        } else
            return "The queue is empty.";
    }

    public void addVIPToQueue(String str)
    {
        list.add(0, str);
    }

    public void printList()
    {
        System.out.print("[");
        for (String str : list)
            System.out.print(str + ", ");
        System.out.print("\b\b}");
    }
}

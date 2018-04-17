import java.util.ArrayList;

/**
 * 1. Queues
 * 
 * @author Caleb Yun
 * @version 4/11/2018
 */
public class QueuesLab implements Queue
{
    private ArrayList<String> list;
    
    // Constructor
    public QueuesLab()
    {
        list = new ArrayList<String>();
    }
    
    // Add string to queue
    public void addToQueue(String str)
    {
        list.add(str);
    }

    // Remove first value and return it.
    public String removeFromQueue()
    {
        if (list.size() > 0) {
            String str = list.get(0);
            list.remove(0);
            return str;
        } else
            return "The queue is empty.";
    }
    
    // Add string to beginning of queue
    public void addVIPToQueue(String str)
    {
        list.add(0, str);
    }

    // Print queue in list form
    public void printList()
    {
        System.out.print("[");
        for (String str : list)
            System.out.print(str + ", ");
        System.out.print("\b\b}");
    }
}

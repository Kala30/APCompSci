import java.util.ArrayList;

/**
 * 2. Stacks Lab
 *
 * @author Caleb Yun
 * @version 4/16/2018
 */
public class StacksLab implements Stack
{
    ArrayList<String> list;

    // Constructor
    public StacksLab()
    {
        list = new ArrayList<String>();
    }

    // Pushes a string to top of stack
    public void push(String str)
    {
        list.add(str);
    }

    // Returns the string on top and remove it
    public String pop()
    {
        if (list.size() == 0)
            return "The stack is empty.";
        else {
            String value = list.get(list.size()-1);
            list.remove(list.size()-1);
            return value;
        }
    }

    // Returns string on top
    public String peek()
    {
        if (list.size() == 0)
            return "The stack is empty.";
        else
            return list.get(list.size()-1);
    }
}

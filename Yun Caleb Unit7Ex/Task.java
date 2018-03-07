
/**
 * U7 Assignment #2: Task Class
 *
 * @author Caleb Yun
 * @version 3/6/2018
 */
public class Task implements Priority, Complexity, Comparable
{
    private int priority;
    private int complexity;
    private String name;
    
    public Task(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public int getComplexity()
    {
        return complexity;
    }
    
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    
    public void setComplexity(int complexity)
    {
        this.complexity = complexity;
    }
    
    public int compareTo(Object obj)
    {
        Task task = (Task) obj;
        if (task.getPriority() > priority) {
            return 1;
        } else if (task.getPriority() == priority) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public String toString()
    {
        return name + "\nPriority: " + priority + "\nComplexity: " + complexity;
    }
}

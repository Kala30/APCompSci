import java.util.Arrays;

/**
 * U7 Assignment #2: Tester for Task Class
 *
 * @author Caleb Yun
 * @version 3/6/2018
 */
public class TaskTester
{
    public static void main(String[] args)
    {
        Task task1 = new Task("Task 1");
        task1.setPriority(5);
        task1.setComplexity(9000);
        System.out.println(task1);
        
        System.out.println();
        Task task2 = new Task("Task 2");
        task2.setPriority(10);
        task2.setComplexity(1);
        System.out.println(task2);
        
        System.out.println();
        Task task3 = new Task("Task 3");
        task3.setPriority(7);
        task3.setComplexity(25);
        System.out.println(task3);
        
        System.out.println();
        System.out.println("Reordered: ");
        Task[] tasks = {task1, task2, task3};
        Arrays.sort(tasks);
        for (int n = 0; n < tasks.length; n++){
            System.out.println(tasks[n]);
        }
    }
}

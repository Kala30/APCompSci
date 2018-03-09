
/**
 * Question.java
 * Represents a question (and its answer) and a complexity level.
 * 
 * @author Caleb Yun
 * @version 3/5/2018
 */
public class Question implements Complexity, Comparable
{
    // Field Variables
    private String question, answer;
    private int complexityLevel;
    
    // Constructors
    public Question (String query, String result)
    {
        question = query;
        answer = result;
        complexityLevel = DEFAULT_COMPLEXITY;
    }
    
    // Constructor with complexity level
    public Question (String query, String result, int complexity)
    {
        question = query;
        answer = result;
        complexityLevel = complexity;
    }
    
    // Setter
    public void setComplexity (int level)
    {
        complexityLevel = level;
    }
    
    // Getters
    public int getComplexity ()
    {
        return complexityLevel;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public String getAnswer()
    {
        return answer;
    }
    
    // Other methods
    public boolean answerCorrect (String candidateAnswer)
    {
        return answer.equals(candidateAnswer);
    }
    
    // toString method
    public String toString()
    {
        return question + "\n" + answer;
    }
    
    // compareTo
    // Compares by complexity level.
    public int compareTo(Object obj)
    {
        return this.complexityLevel - ((Question)obj).getComplexity();
    }
}

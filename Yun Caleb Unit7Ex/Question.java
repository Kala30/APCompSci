
/**
 * Question.java
 * Represents a question (and its answer).
 * 
 * @author Caleb Yun
 * @version 3/5/2018
 */
public class Question implements Complexity
{
    // Field Variables
    private String question, answer;
    private int complexityLevel;
    
    // Constructor
    public Question (String query, String result)
    {
        question = query;
        answer = result;
        complexityLevel = 1;
    }
    
    // Setter
    public void setComplexity (int level)
    {
        complexityLevel = level;
    }
    
    // Getter
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
    
    // Other methdos
    public boolean answerCorrect (String candidateAnswer)
    {
        return answer.equals(candidateAnswer);
    }
    
    // toString method
    public String toString()
    {
        return question + "\n" + answer;
    }
}

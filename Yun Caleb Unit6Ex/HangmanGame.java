
/**
 * Write a description of class HangmanGame here.
 * 
 * @author Caleb Yun, Iain Ro
 * @version February 9, 2018
 */
public class HangmanGame
{
    private String answer;
    private StringBuffer guess = new StringBuffer();
    private StringBuffer tried = new StringBuffer("");

    public HangmanGame(String answer)
    {
        this.answer = answer;
        for (int i = 0; i < answer.length(); i++)
        {
            guess.append('-');
        }
    }

    public String getWord()
    {
        return answer;
    }

    public String getGuessed()
    {
        return guess.toString();
    }

    public String getTried()
    {
        return tried.toString();
    }

    public int tryLetter(char letter)
    {
        String strLetter = Character.toString(letter);
        if(tried.indexOf(strLetter) >= 0)return 0;
        else if(answer.indexOf(letter) >= 0)
        {
            tried.append(letter);
            int index = answer.indexOf(letter);
            while(index >= 0)
            {
                guess.setCharAt(index, letter);
                index = answer.indexOf(letter, index+1);
            }
            return 1;
        }
        else
        {
            tried.append(letter);
            return -1;
        }

    }
}

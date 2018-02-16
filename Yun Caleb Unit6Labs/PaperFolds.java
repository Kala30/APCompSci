
/**
 * Folds paper, and gives the pattern. 
 * 
 * @author Iain Ro, Caleb Yun
 * @version 2/16/18
 */
public class PaperFolds
{
    /**
     * This reursive method takes an int for the number of folds
     * It returns a string, showing how the folds are on a paper
     * @param number of folds
     * @return the final pattern of folds
     */
    public static String paperFolds(int fold)
    {
        if(fold == 0)return "";
        else if(fold == 1) return "v";
        else
        {
            return reverseAndFlip(paperFolds(fold-1)) + "v" + paperFolds(fold-1);
        }
    }
    
    /**
     * This recursive method takes in a String for folds, and returns a String that is both reversed, and flipped
     * @param folds is the given String
     * @return flipped and reversed string
     */
    public static String reverseAndFlip(String folds)
    {
        if(folds.length() <= 1)
        {
            char something = flip(folds.charAt(0));
            return Character.toString(something);
        }
        else
        {
            return Character.toString(flip(folds.charAt(folds.length()-1))) + reverseAndFlip(folds.substring(0,folds.length() - 1));
        }
    }
    
    /**
     * This method flips the char from a 'v' to a '^' and vice versa
     * @param fold is a 'v' or a '^'
     * @return flipped char
     */
    public static char flip(char fold)
    {
        if(fold == 'v') return '^';
        else if(fold == '^') return 'v';
        else return '?';
    }
}

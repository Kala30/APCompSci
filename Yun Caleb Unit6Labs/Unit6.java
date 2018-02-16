
/**
 * Unit 6 Labs Part 1
 *
 * @author Iain Ro, Caleb Yun
 * @version 2/15/2018
 */
public class Unit6
{
    /**
     * Correctly capitalizes names.
     * 
     * @param name    Assumed to be single word
     * @return Name capitalized
     */
    public static String capitalize(String name)
    {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    
    /**
     * Tests if word is a palindrome recursively.
     * 
     * @param word  Word to be tested
     * @return True or false
     */
    public static boolean isPalindrome(String word)
    {
        int length = word.length();
        if (length <= 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(length - 1)) {
            return isPalindrome(word.substring(1, length - 1));
        } else {
            return false;
        }
    }
}

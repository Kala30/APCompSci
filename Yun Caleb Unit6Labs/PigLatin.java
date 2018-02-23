
/**
 * Returns a word changed to Pig Latin
 * 
 * @author Iain Ro, Caleb Yun 
 * @version 2/16/18
 */
public class PigLatin
{
    /**
     * Anslatestray ingstray otay igpay atinlay.
     * 
     * @param ordway ordway otay ebay anslatedtray
     * @return ordway anslatedtray ordway
     */
    public static String translateWord(String word)
    {
        if(word.substring(0,2).equals("qu"))
        {
            return word.substring(2) + "quay";
        }
        
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 'y' && i != 0)return word.substring(i) + word.substring(0, i) + "ay";
            else if(isVowel(word.charAt(i)) && i ==0)
            {
                return word.substring(i) + word.substring(0, i) + "way";
            }
            else if(isVowel(word.charAt(i)) && i!=0)
            {
                return word.substring(i) + word.substring(0, i) + "ay";
            }
        }
        return null;
    }

    /**
     * Checks if char is a vowel.
     * @param c inputted char
     * @return boolean true if is a vowel
     */
    public static boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e'| c == 'i' || c == 'o' || c == 'u') return true;
        else return false;
    }
}

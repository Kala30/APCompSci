
/**
 * Write a description of class Exercises here.
 * 
 * @author Iain Ro, Caleb Yun
 * @version 2/7/2018
 */
public class Exercises
{
    public static String removeDashes(String ssn)
    {
        return ssn.replace("-", "");
    }
    
    public static String scroll(String str)
    {
        return str.substring(1) + str.charAt(0);
    }
    
    public static String convertName(String name)
    {
        return name.substring(name.indexOf(",") + 2) + " " + name.substring(0, name.indexOf(",") - 1);        
    }
    
    public static String negateString(String str)
    {
        str = str.replace("0", "a");
        str = str.replace("1", "0");
        return str.replace("0", "1");
    }
    
    public static String findCommentMarks(String str)
    {
        int first = str.indexOf("/*");
        int last = str.indexOf("*/");
        if (first >= 0 && last >=0 && first < last)
            return str.substring(0, first) + str.substring(last + 2);
        else
            return str;
    }
    
    public static String cutOut(String str, String cutOut)
    {
        return str.replaceFirst(cutOut, "");
    }
    //Exercises 2
    
    public static boolean onlyDigits(String str)
    {
        String count = "";
        for(int i = 0; i<str.length(); i++)
        {
            count += "9";
        }
        if(str.compareTo(count) > 0)return false;
        else return true;
    }
}

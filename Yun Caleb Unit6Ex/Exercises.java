import java.util.Scanner;
import java.util.Random;

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
        char c;
        
        for(int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            if (!(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')) {
                return false;
            }
        }
        return true;
    }
    
    public static void testHyp()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("s2 = ");
        String s2 = sc.nextLine();
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        
        System.out.println(s1.compareTo(s2));
        System.out.println(n1 - n2);
    }
    
    // Exercises 3
    
    public static String shuffle(String abc)
    {
        StringBuffer shuffled = new StringBuffer(abc);
        int n = shuffled.length()-1;
        Random rand = new Random();
        while(n > 1)
        {
            int randN = rand.nextInt(n);
            String randStr = Character.toString(shuffled.charAt(randN));
            String nStr = Character.toString(shuffled.charAt(n));
            shuffled.replace(n, n+1, randStr);
            shuffled.replace(randN, randN+1, nStr);
            n--;
        }
        return shuffled.toString();
    }
    
    // Unit 6 Labs Part 2: Warm Up
    
    /**
     * Checks if s1 is anagram of s2.
     */
    public static boolean isAnagram(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        // Remove whitespace
        s1 = s1.replaceAll("\\s+","");
        s2 = s2.replaceAll("\\s+","");
        
        if (s1.length() != s2.length()) {
            return false;
        }
            
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) < 0)
                return false;
        }
        return true;
    }
}

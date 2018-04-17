import java.util.ArrayList;

/**
 * 3. Happy Numbers
 *
 * @author Caleb Yun
 * @version 4/16/2018
 */
public class HappyNumbers
{
    // Checks if num is happy
    public boolean isHappy(int num)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            list.add(num);
            num = sumOfSquaresOfDigits(num);
            if (num == 1)
                return true;
            else if (list.indexOf(num) >= 0)
                return false;
        }
    }
    
    // Returns sum of the squares of digits in num
    private int sumOfSquaresOfDigits(int num)
    {
        if (num < 10)
            return num * num;
        else {
            return sumOfSquaresOfDigits(num/10) + sumOfSquaresOfDigits(num % 10);
        }
    }
}

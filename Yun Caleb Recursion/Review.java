
/**
 * Write a description of class Review here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Review
{
    static void timesTable(int num)
    {
        int largest = String.valueOf(num * num).length();
        System.out.println();
        for (int row = 0; row <= num; row++) {
            for (int column = 0; column <= num; column ++) {
                if(row == 0) {
                    if(column == 0) {
                        System.out.print("   |  ");
                    } else {
                        System.out.print(column + "  ");
                    }
                    if (column == num) {
                        System.out.print("\n");
                        for (int i = 0; i <= num*3; i++)
                            System.out.print("-");
                    }
                } else {
                    if (column == 0){
                        System.out.print(" " + row + " |");
                    } else {
                        int product = row * column;
                        int length = String.valueOf(product).length();
                        for (int i = 0; i <= largest - length; i++) {
                            System.out.print(" ");
                        }
                        System.out.print(product);
                    }
                }
            }
            System.out.print("\n");
        }
    }
}

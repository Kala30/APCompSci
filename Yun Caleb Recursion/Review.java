
/**
 * Write a description of class Review here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Review
{
    static void timesTable()
    {

        System.out.println();
        for (int row = 0; row <= 9; row++) {
            for (int column = 0; column <= 9; column ++) {
                if(row == 0) {
                    if(column == 0) {
                        System.out.print("   |  ");
                    } else {
                        System.out.print(column + "  ");
                    }
                    if (column == 9) {
                        System.out.print("\n");
                        for (int i = 0; i <= 10*3; i++)
                            System.out.print("-");
                    }
                } else {
                    if (column == 0){
                        System.out.print(" " + row + " |");
                    } else {
                        int product = row * column;
                        if (product >= 10) {
                            System.out.print(" " + product);
                        } else {
                            System.out.print("  " + product);
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }
}

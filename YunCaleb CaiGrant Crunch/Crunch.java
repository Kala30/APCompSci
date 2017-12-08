import java.util.Scanner;
import java.util.Random; 
import java.util.Arrays;
import java.util.List;

/**
 * Game of Crunch class
 * 
 * @author Grant Cai, Caleb Yun
 * @version Created on 11/20/17
 */

public class Crunch
{
    private static int total = 21;
    private static int start = 21;
    private static int sticksPerTurn = 2;

    private static boolean cpuEnabled = false;
    private static String[] stickArray = new String[total];
    private static boolean playAgain;

    public static void playCrunch()
    {
        playAgain = true;
        Scanner sc = new Scanner(System.in);
        while (playAgain) {
            System.out.print("\f");
            System.out.println("Welcome to the Game of Crunch!\n");
            System.out.println("1. Normal (21)");
            System.out.println("2. 25 Crunch");
            System.out.println("3. 21 Crunch Expanded");
            System.out.println("4. 35 Crunch");
            System.out.println("5. Quit");
            System.out.println();
            
            int mode = userInputInt("Choose mode: ", Arrays.asList(1, 2, 3, 4, 5 ));

            switch(mode) {
                case 1:  total = 21;   // Normal
                sticksPerTurn = 2;
                break;
                case 2:  total = 25;   // 25 Crunch
                sticksPerTurn = 2;
                break;
                case 3:  total = 21;   // 21 Crunch Expanded
                sticksPerTurn = 3;
                break;
                case 4:  total = 35;   // 35 Crunch
                sticksPerTurn = 4;
                break;
                case 5: playAgain = false;   // Quit
                break;
                default: total = 21;   // Default
                sticksPerTurn = 2;
                break;
            }
            
            if (playAgain) {
                crunchGame(); // Start crunch game
            }
        }

        System.out.print("\f");
        System.out.println("Thanks for playing!");
        System.out.println("\nGoodbye!");
    }

    private static void crunchGame()
    {
        stickArray = new String[total]; // Instantiate new array with # of sticks

        Scanner sc = new Scanner(System.in);

        System.out.print("\f");
        System.out.println("Welcome to the Game of Crunch!");
        System.out.println();

        Arrays.fill(stickArray, "|"); // Fill stick array

        System.out.println("1. Normal");
        System.out.println("2. Hard");
        System.out.println("3. Impossible");
        System.out.println();
        
        int difficulty = userInputInt("Choose difficulty: ", Arrays.asList(1, 2, 3));

        if (difficulty == 1) {
            cpuEnabled = false;
        } else {
            cpuEnabled = true;
        }

        System.out.print("\f");

        // Computer goes first if difficulty is impossible
        if (difficulty != 3) {
            int turn = userInputInt("Would you like to go first or second? (1/2): ", Arrays.asList(1, 2));
            System.out.print("\f");

            if (turn == 1) {
                playerTurn();
            }
        }

        while (total > 0) // Main game loop
        {
            cpuTurn();

            if (total == 0) {
                printSticks();
                System.out.println("\n\nYOU WIN! :)");
                break;
            }

            playerTurn();

            if (total == 0) {
                printSticks();
                System.out.println("\n\nCOMPUTER WINS! :(");
                break;
            }
        }

        System.out.println();
        System.out.print("Play again? (y/n): ");

        String input;
        boolean validInput = false;
        do {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                playAgain = true;
                total = start;
                validInput = true;
            } else if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
                playAgain = false;
                validInput = true;
            }
        } while(!validInput);
        System.out.print("\f");
    }
    
    private static int userInputInt(String prompt, List<Integer> validInputs)
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        
        do {
            System.out.print(prompt);
            try {
                input = sc.nextInt();
            } catch(java.util.InputMismatchException e) { // Catch if user inputs incorrect type
                sc.next();
                continue;
            }
        } while (!validInputs.contains(input));
        
        return input;
    }
    
    private static void playerTurn()
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        printSticks();
        System.out.println();
        do {
            if (total < sticksPerTurn) {
                if (total == 1) {
                    System.out.print("Choose up to 1 stick: ");
                } else {
                    System.out.print("Choose up to " + total + " sticks: ");
                }
            } else {
                System.out.print("Choose up to " + sticksPerTurn + " sticks: ");
            }
            try {
                input = sc.nextInt();
            } catch(java.util.InputMismatchException e) {
                input = 0;
                sc.next();
                continue;
            }
        } while(!((total >= input) && (input <= sticksPerTurn) && (input > 0)));

        int oldTotal = total;
        total -= input;
        Arrays.fill(stickArray, total, oldTotal, "O");

        System.out.print("\f");
    }

    private static void cpuTurn()
    {
        int output;
        Scanner sc = new Scanner(System.in);
        printSticks();
        System.out.println();
        if (cpuEnabled) {
            output = smartCpu();
        } else {
            Random generator = new Random();
            if (total >= sticksPerTurn) {
                output = generator.nextInt(sticksPerTurn) + 1;
            } else {
                output = generator.nextInt(total) + 1;
            }
        }
        if (output == 1) {
            System.out.println("Computer took 1 stick");
        } else {
            System.out.println("Computer took " + output + " sticks");
        }

        int oldTotal = total;
        total -= output;
        Arrays.fill(stickArray, total, oldTotal, "X");

        System.out.print("\nPress ENTER to continue...");
        sc.nextLine();
        System.out.print("\f");
    }

    private static void printSticks() {
        for (String stick : stickArray)
        {
            System.out.print(stick + " ");
        }
        System.out.println("\nSticks remaining: " + total);
    }

    private static int smartCpu()
    {
        // Losing position is always N=kp+(k+1)
        // where N is desired number of sticks on table
        // and p is number sticks that may be removed
        // k is turn index (# of turns from winning)
        int N = 0;
        final int p = sticksPerTurn;

        // Generate nearest losing position
        for (int k = 0; N + p < total; k++) {
            N = (k * p) + (k + 1);
        }

        if (N == total) {
            // Cannot reach losing position, choose random
            Random rand = new Random();
            return rand.nextInt(sticksPerTurn) + 1;
        } else {
            if (N == 0) {
                // Winning or losing move
                if (total - 1 != 0)
                    return total - 1;
                else
                    return 1;
            } else {
                // Choose nearest reachable losing position
                return total - N;
            }
        }
    }
}

import java.util.Scanner;

/**
 * Write a description of class PairProgrammingEx here.
 * 
 * @author Dhakshin/Caleb 
 * @version (a version number or a date)
 */

public class PairProgrammingEx
{
    public static void quickConvo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What would you like me to do?");
        String input = sc.nextLine();
        System.out.println("I’m sorry, " + name + ". I’m afraid I can’t " + input + ".");
        System.out.println("What is your age?");
        String age = sc.nextLine();
        System.out.println("What is your favorite color");
        String color = sc.nextLine();
        System.out.println("I am also "+age+" years old and my favoite color is "+color);
    }

    public static void guessNum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number.\nMultiply it by 50.\nAdd 15.\nDivide their number by 5.\nInput your final answer.");
        int input = sc.nextInt();

        System.out.println("Your number is "+((input * 5) - 15) / 50);

    }

    public static double computeShippingCost(int nJars){
        int nCartons =  nJars / 12 + 1;
        double tWeight = (nCartons*(1.0+9.0/16)+(nJars*(1.0+5.0/16)));
        double Cost = ((1.44 * nCartons) + (int)(tWeight + 1) * 0.96) + 3;
        return Math.round(Cost * 100.0) / 100.0;
    }

    public static void main(String[] args){

        System.out.println(convertToHumanAge(1));
        //13
        System.out.println(convertToHumanAge(2));
        //18
        System.out.println(convertToHumanAge(3));
        //24
    }

    public static int convertToHumanAge(int dogYears)
    {
        return (int)(8.1 + (dogYears * 5.3));
    }
}

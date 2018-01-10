
/**
 * SoccerTeamTester
 *
 * @author Caleb Yun
 * @version 1/9/2018
 */
public class SoccerTeamTester
{
    public static void main(String[] args)
    {
        SoccerTeam fuel = new SoccerTeam();
        SoccerTeam dynasty = new SoccerTeam();
        SoccerTeam gladiators = new SoccerTeam();
        
        // Tournament #1
        SoccerTeam.startTournament();
        fuel.played(dynasty, 3, 3);
        dynasty.played(fuel, 2, 1);
        gladiators.played(dynasty, 3, 2);
        gladiators.played(dynasty, 2, 3);
        
        System.out.println("Team 1: " + fuel.getPoints());
        System.out.println("Team 2: " + dynasty.getPoints());
        System.out.println("Team 3: " + gladiators.getPoints());
        System.out.println("Total Games: " + SoccerTeam.getTotalGames() + "\nTotal Goals: " + SoccerTeam.getTotalGoals());
        
        fuel.reset();
        dynasty.reset();
        gladiators.reset();
        System.out.println();
        
        // Tournament #2
        SoccerTeam.startTournament();
        fuel.played(gladiators, 2, 3);
        dynasty.played(fuel, 3, 4);
        gladiators.played(dynasty, 1, 1);
        
        System.out.println("Team 1: " + fuel.getPoints());
        System.out.println("Team 2: " + dynasty.getPoints());
        System.out.println("Team 3: " + gladiators.getPoints());
        System.out.println("Total Games: " + SoccerTeam.getTotalGames() + "\nTotal Goals: " + SoccerTeam.getTotalGoals());
    }
}

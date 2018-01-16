
/**
 * TestingElevator
 * 
 * @author Caleb Yun
 * @version 1/16/2018
 */
public class TestingElevator
{
    public static void main(String[] args)
    {
        Elevator e1 = new Elevator(10, 5);
        e1.loadPassengers(4);
        System.out.println("Floor: " + e1.getCurrentFloor() + " Passengers: " + e1.getNumberOfPassengers());
        e1.moveToFloor(5);
        e1.unloadPassengers(3);
        System.out.println("Floor: " + e1.getCurrentFloor() + " Passengers: " + e1.getNumberOfPassengers());
    }
}

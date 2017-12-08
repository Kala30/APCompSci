
/**
 * For testing Elevator class
 *
 * @author Caleb Yun
 * @version Created on 12/7/2017
 */
public class ElevatorTester extends junit.framework.TestCase
{

    public void testElevatorTest1()
    {
        Elevator elevator1 = new Elevator(5, 10);  // constructs a new elevator (top floor = 5, max passengers = 10)
        assertEquals(true, elevator1.loadPassengers(6));  // attempts to load 6 passengers -- should be okay
        assertEquals(false, elevator1.loadPassengers(10));  // attempts to load 10 more -- should fail
        assertEquals(6, elevator1.getNumberOfPassengers());  // number of passengers should still be 6
    }
    
    public void testElevatorTest2()
    {
        Elevator elevator1 = new Elevator(5, 10);  // constructs a new elevator (top floor = 5, max passengers = 10)
        assertEquals(true, elevator1.moveToFloor(3));  // attempts to move to floor 3 -- should be okay
        assertEquals(false, elevator1.moveToFloor(6));  // attempts to move to floor 6 -- should fail
        assertEquals(false, elevator1.moveToFloor(-1));  // attempts to move to floor -1 -- should fail
        assertEquals(3, elevator1.getCurrentFloor());  // current floor should still be 3
    }
    
    public void testElevatorTest3()
    {
        Elevator elevator1 = new Elevator(5, 10);  // constructs a new elevator (top floor = 5, max passengers = 10)
        elevator1.loadPassengers(5);  // loads five passengers
        assertEquals(false, elevator1.unloadPassengers(10));  // attempts to unload 10 passengers -- should fail
        assertEquals(5, elevator1.getNumberOfPassengers());  // number of passengers should still be 5
        assertEquals(true, elevator1.unloadPassengers(4));  // attempts to unload 4 passengers -- should be okay
        assertEquals(1, elevator1.getNumberOfPassengers());  // number of passengers should be 1
    }
    
}

/*
public class TestingElevator
{
    public static void main(String[] args) {
        Elevator testingElevator = new Elevator(10, 5); // 10 floors, 5 passengers
        
        System.out.println("Loading 5 passengers: " + testingElevator.loadPassengers(5));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("Moving to floor 3: " + testingElevator.moveToFloor(3));
        System.out.println("Current floor: " + testingElevator.getCurrentFloor());
        
        System.out.println("Unloading 2 passengers: " + testingElevator.unloadPassengers(2));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("=== ERRORS ===");
        
        System.out.println("Loading 10 passengers: " + testingElevator.loadPassengers(10));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("Loading -4 passengers: " + testingElevator.loadPassengers(-4));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("Moving to floor -100: " + testingElevator.moveToFloor(-100));
        System.out.println("Current floor: " + testingElevator.getCurrentFloor());
        
        System.out.println("Unloading 10 passengers: " + testingElevator.unloadPassengers(10));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("Unloading -7 passengers: " + testingElevator.unloadPassengers(-7));
        System.out.println("Current passengers: " + testingElevator.getNumberOfPassengers());
        
        System.out.println("Moving to floor 100: " + testingElevator.moveToFloor(100));
        System.out.println("Current floor: " + testingElevator.getCurrentFloor());
    }
}
*/
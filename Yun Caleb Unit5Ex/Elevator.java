
/**
 * AP CS: Elevator Class
 *
 * @author Caleb Yun
 * @version Created on 12/7/2017
 */
public class Elevator
{
    private int maxFloor;
    private int currentFloor;
    private int maxPassengers;
    private int currentPassengers;
    
    public Elevator(int maxFloor, int maxPassengers) {
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        currentPassengers = 0;
        currentFloor = 1;
    }
    
    public boolean loadPassengers(int passengers) {
        if (passengers <= maxPassengers - currentPassengers && passengers > 0) {
            currentPassengers += passengers;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean unloadPassengers(int passengers) {
        if (passengers <= currentPassengers && passengers > 0) {
            currentPassengers -= passengers;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean moveToFloor(int floor) {
        if (floor >= 1 && floor <= maxFloor) {
            currentFloor = floor;
            return true;
        } else {
            return false;
        }
    }
    
    public int getNumberOfPassengers() {
        return currentPassengers;
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }
}

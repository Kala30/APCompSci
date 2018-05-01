public class RoboDog extends Robot implements Pet
{
    public RoboDog() {
        super();
    }
    
    public void play() {
        System.out.println("Beep! Beep! Boop!");
        useBattery();
    }
}

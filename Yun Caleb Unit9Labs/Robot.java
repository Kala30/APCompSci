public class Robot
{
    private double batteryCharge;

    public Robot() {
        batteryCharge = 10;
    }

    public void chargeBattery() {
        batteryCharge = 10;
    }

    public void useBattery() {
        batteryCharge--;
    }
}
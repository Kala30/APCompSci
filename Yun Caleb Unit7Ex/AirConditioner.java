/**
 * This interface sets up a design for an AirConditioner, that can 
 * decrease or increase the temperature, and return the temperature
 *
 * @author Iain Ro
 * @version 3/7/18
 */
public interface AirConditioner
{
	double getTemp();
	void decreaseTemp(double increment);
	void increaseTemp(double increment);
}

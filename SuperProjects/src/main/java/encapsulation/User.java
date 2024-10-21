package encapsulation;

public class User {
	private int pin;
	public void setter(int pin)
	{
	this.pin=pin;
	}
	public boolean getter()
	{
		if(pin == 1001 || pin == 1234 || pin == 1212)
		{
			return true;
		}
	return false;
	}


}

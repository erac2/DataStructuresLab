
class Lamp {

	boolean isOn;
	
	void turnOn() {
		isOn = true;
		System.out.println("Light on? " + isOn);
	}
	
	//method to turnoff the light
	void turnOff() {
		isOn = false;
		System.out.println("Light on? " + isOn);
		
class Main{
	
	public static void main(String[] args)
	{
		//create objects led and halogen
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//turn on the light by
		//calling method turnOn()
		led.turnOn();
		
		//turnn off the light by
		//calling method turnOff()
		halogen.turnOff();
	}
}
	}
}

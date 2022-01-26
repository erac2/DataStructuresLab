
public class Lamp2 {

boolean isOn;
	
	void turnOn() {
		isOn = true;
		System.out.println("Light on? " + isOn);
	}
	
	//method to turnoff the lgiht
	void turnOff() {
		isOn = false;
		System.out.println("Light on? " + isOn);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lamp led = new Lamp();
		
		led.turnOn();
	}

}


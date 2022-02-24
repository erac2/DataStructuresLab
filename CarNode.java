package vehicle;

public class CarNode {
	private CarNode next;
	private Car car;

	public CarNode(Car car) {
		this.car = car;
		next = null;
	}

	public CarNode getNext() {
		return next;
	}

	public void setNext(CarNode next) {
		this.next = next;
	}

	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String toString() {
		
	}

}

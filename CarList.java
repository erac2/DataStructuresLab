package vehicle;

public class CarList {
	private CarNode head;

	public CarList() {
		head = null;
	}

	public void insert(Car car) {
		CarNode newNode = new CarNode(car);
		newNode.setNext(head);
		head = newNode;
	}

	public CarNode getFirst() {
		return head;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		CarNode node = head;
		while(node != null) {
			result.append(node.getCar().toString());
		}
	}

}

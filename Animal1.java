package Day7;

class Animal {

	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {

	@Override
	public void display() {
		System.out.println("I am a dog");
	}

	public void printMessage() {
		display();
	}
}

class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.printMessage();

	}

}

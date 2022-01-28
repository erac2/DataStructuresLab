
class Animal {

	Animal()
	{
		System.out.println("I am an animal");
	}

	//parameterized constructor
	Animal(String type){
		System.out.println("Type: " + type);
	}
}

//Dog inherit from Animal
class Dog extends Animal {

	//default constructor
	Dog(){

		//calling parameterized constructor of the superclass
		super("Animal");	

		System.out.println("I am a dog");
	}

	//new method in subclass

	public void bark()
	{
		System.out.println("I can bark");
	}
}

class Main2{
	public static void main(String []args)
	{
		Dog dog1 = new Dog();
	/**	Dog labrador = new Dog();

		//call method of superclass
		//using object of subclass
		labrador.eat();
		labrador.bark();*/

	}
}







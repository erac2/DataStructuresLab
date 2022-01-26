
public class Practice6 {
	private String name;

	Practice6()
	{
		System.out.println("Constructor Called: ");
		name = "Programiz";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructor is invoked while
		//creating an object of the Main class

		Practice6 obj = new Practice6();
		System.out.println("The name is " + obj.name);
	}

}

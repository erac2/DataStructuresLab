package Day5;

public class Language2 {

	public void displayInfo() {
		System.out.println("Common English Language");
	}
}

class Java extends Language2{
	@Override
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}

class Main{
	public static void main(String[] args)
	{
		
		//create an object of Java class
		Java j1 = new Java();
		j1.displayInfo();
		
		//create an object of Language class
		Language2 l1 = new Language2();
		l1.displayInfo();
	}
}
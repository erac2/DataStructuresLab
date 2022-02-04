package Day4;

public class ProgrammingLanguage{
	public void display() {
		System.out.println("I am Programming Language.");
	}

	class Java extends ProgrammingLanguage{
		@Override
		public void display() {
			System.out.println("I am Object-Oriented Programming Language.");
		}
	}
	/**
	class Main{
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//declare an object variable
			ProgrammingLanguage p1;

			//create object of ProgrammingLanguage
			p1 = new ProgrammingLanguage();
			p1.display();

			//create object of Java class
			p1 = new Java();
			p1.display();

		}

	}*/
}
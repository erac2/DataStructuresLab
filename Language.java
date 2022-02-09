package Day5;

interface Language {
	void getName(String name);
}

//class implements interface
class ProgrammingLanguage implements Language{

	//implemntation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}
}
/**
class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}

}
*/
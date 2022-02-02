package Day3;

interface Language1 {
void getName(String name);
}

//class implements interface
class ProgrammingLanguage implements Language1{
	
	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}
}



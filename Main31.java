package Day9;
import java.util.LinkedList;
public class Main31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>();
		
		//add elements
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("LinkedList: " + languages);
		
		//get the element from the linked list
		String str = languages.get(1);
		System.out.println("Element at index 1: " + str);
	}

}

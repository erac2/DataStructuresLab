package Day9;

import java.util.LinkedList;

public class Main30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create linkedList
		
		LinkedList<String> animals = new LinkedList<>();
		
		//Add elements to LinkedList
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);
		
		//add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println("Updated LinkedList: " + animals);
	}

}

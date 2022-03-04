package Day12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

public class Main58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBlockingQueue<String> animals = animals = new ArrayBlockingQueue<>(5);
		
		//Add elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayBlockingQueue: " + animals);
		
		//Using peek()
		String element = animals.peek();
		System.out.println("Accessed Element: " + element);
		
		//Using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.println("ArrayBlockingQueue Elements: ");
		
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

}

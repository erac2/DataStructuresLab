package Day12;

import java.util.PriorityQueue;

public class Main53 {
	public static void main(String[]args) {
		//Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		//Using the add() method
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue: " + numbers);
		
		//Using the offer() method
		boolean result = numbers.remove(2);
		System.out.println("Is the element 2 removed? " + result);
		
		//Using the poll() method
		int number = numbers.poll();
		System.out.println("Removde Element Using Poll(): " + number);
	
	}
}

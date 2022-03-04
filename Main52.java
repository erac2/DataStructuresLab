package Day12;

import java.util.PriorityQueue;

public class Main52 {
	public static void main(String[]args) {
		//Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		
		//Using the add() method
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue: " + numbers);
		
		//Using the offer() method
		numbers.offer(1);
		System.out.println("Updated PriorityQueue: " + numbers);
		
		//Using the peek() method
		int number = numbers.peek();
		System.out.println("Accessed Element: " + number);
	}
}

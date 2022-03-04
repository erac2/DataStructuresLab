package Day12;

import java.util.Queue;
import java.util.PriorityQueue;


public class Main51 {

	public static void main(String[]args) {
		//Creating Queue using the linkedList ckass
		Queue<Integer> numbers = new PriorityQueue<>();
		
		//offer elements to the Queue
		numbers.offer(5);
		numbers.offer(1);
		numbers.offer(2);
		System.out.println("Queue: " + numbers);
		
		//Access elements of the Queue
		int accessedNumber = numbers.peek();
		System.out.println("Accessed Element: " + accessedNumber);
		
		//Remove elements from the Queue
		int removedNumber = numbers.poll();
		System.out.println("Reoved element: " + removedNumber);
		
		System.out.println("Updated Queue: " + numbers);
	}
}

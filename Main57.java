package Day12;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);
		
		try {
			//Insert element to blocking queue
			numbers.put(2);
			numbers.put(1);
			numbers.put(3);
			System.out.println("BlockingQueue: " + numbers);
			
			//Removing Elements from blocking queue
			int removedNumber = numbers.take();
			System.out.println("Removed Number: " + removedNumber);
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}

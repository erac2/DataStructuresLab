package Sets;
import java.util.HashSet;

public class Set5 {

	public static void main(String[]args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);
		
		//Using remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);
		
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);
	}
}

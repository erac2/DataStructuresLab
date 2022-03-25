package Sets;
import java.util.HashSet;
import java.util.Iterator;

public class Set4 {

	public static void main(String[]args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);
		
		//Calling iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.println("HashSet using Iterator: ");
		//Accessomg elements
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}
}

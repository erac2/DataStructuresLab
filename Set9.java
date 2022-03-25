package Sets;
import java.util.HashSet;

public class Set9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("HashSet1: " + numbers);
		
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet2: " + primeNumbers);
		
		//Check if primeNumbers is a subset of numbers
		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("Is HashSet2 is a subset of HashSet1? " + result);
	
	}

}

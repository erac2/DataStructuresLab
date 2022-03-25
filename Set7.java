package Sets;
import java.util.HashSet;

public class Set7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("HashSet1: " + primeNumbers);
		
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet2: " + evenNumbers);
		
		//Itersection of two sets
		evenNumbers.retainAll(primeNumbers);
		System.out.println("Intersection is: " + evenNumbers);
	}

}

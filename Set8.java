package Sets;
import java.util.HashSet;

public class Set8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);
		
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: " + oddNumbers);
		
		//difference between HashSet1 and HashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference: " + primeNumbers);
	}

}

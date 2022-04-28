package TreeMaps;
import java.util.TreeMap;

public class Maps9 {
	public static void main(String[]args) {
		TreeMap<String, Integer> numbers = new TreeMap<>();

		//Insert elements to map
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		System.out.println("TreeMap: " + numbers);

		//Access the first key of the map
		System.out.println("First Key: " + numbers.firstKey());

		//Access the last key of the map
		System.out.println("Last Key: " + numbers.lastKey());
		
		//Remove the first entry from the mao
		System.out.println("Removed First Entry: " + numbers.pollFirstEntry());
		
		//Remove the last entry from the map
		System.out.println("Removed Last Entry: " + numbers.pollLastEntry());

	}

}

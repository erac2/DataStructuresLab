package TreeMaps;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Map3 {

	public static void main (String[] args) {
		
		NavigableMap<String, Integer> numbers = new TreeMap<>();
	
		//Insert elements to map
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("Three", 3);
		System.out.println("NavigableMap: " + numbers);

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
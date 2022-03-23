package Maps;
import java.util.Map.Entry;
import java.util.HashMap;
public class Main75 {

	public static void main(String []args) {
	HashMap<Integer, String> languages = new HashMap<>();
	languages.put(1, "Java");
	languages.put(2, "Python");
	languages.put(3, "JavaScript");
	System.out.println("HashMap: " + languages);
	
	//Iterate through keys only
	System.out.print("Keys: ");
	for(Integer key:languages.keySet()){
		System.out.print(key);
		System.out.print(", ");
	}
	
	//Iterate through values only
	System.out.print("\nValues: ");
	for(String value:languages.values()) {
		System.out.print(value);
		System.out.print(", ");
	}
	
	//Iterate through key/value entries
	System.out.print("\nEntries: ");
	for(Entry<Integer, String> entry : languages.entrySet()) {
		System.out.print(entry);
		System.out.print(", ");
	}
	//remove element associated with key 2
	String value = languages.remove(2);
	System.out.println("Removed Value: " + value);
	
	System.out.println("Updated HasMap: " + languages);
}}

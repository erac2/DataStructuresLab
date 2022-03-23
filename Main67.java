package Maps;

import java.util.LinkedHashMap;
public class Main67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating LinkedHashMap of even numbers
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
		
		//Using put()
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("Orginal LinkedHashMap: " + evenNumbers);
		
		//Using putIfAbsent
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("Updated LinkedHashMap(): " + evenNumbers);
		
		//Creating LinkedHashMap of numbers
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
		numbers.put("One", 1);
		
		//Using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("New LinkedHashMap: " + numbers);
		}

}

package HashTable;

import java.util.EnumMap;

public class HashTable3 {
	
	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an EnumMap of the Size enum
		EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
		
		//Using the put() method
		sizes.put(Size.SMALL, 28);
		sizes.put(Size.MEDIUM, 32);
		sizes.put(Size.LARGE, 36);
		sizes.put(Size.EXTRALARGE, 40);
		System.out.println("EnumMap: " + sizes);
		
		//Using the entrySet() method
		System.out.println("Key/Value mappings: " + sizes.entrySet());
		
		//Using the keySet() method
		System.out.println("Keys: " + sizes.keySet());
		
		//Using the valueS() method
		System.out.println("Values: " + sizes.values());
	
	}
}
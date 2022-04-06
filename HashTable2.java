package HashTable;

import java.util.EnumMap;

public class HashTable2 {

	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an EnumMap of the Size enum
		EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
		
		//Using the put() method
		sizes1.put(Size.SMALL, 28);
		sizes1.put(Size.MEDIUM, 32);
		System.out.println("EnumMap: " + sizes1);
		
		
		EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);
		
		//Using the putAll() method
		sizes2.putAll(sizes1);
		sizes2.put(Size.LARGE, 36);
		System.out.println("EnumMap2: " + sizes2);
	}

}

package HashTable;
import java.util.EnumMap;

public class HashTable4 {
	
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALRGE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an EnumMap of the Size enum
		EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
		
		sizes.put(Size.SMALL, 28);
		sizes.put(Size.MEDIUM, 32);
		sizes.put(Size.LARGE, 36);
		sizes.put(Size.EXTRALRGE, 40);
		System.out.println("EnumMap: " + sizes);
		
		//Using the get() method
		int value = sizes.get(Size.MEDIUM);
		System.out.println("Value of MEDIUM: " + value);
	}

}

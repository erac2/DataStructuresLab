package TreeMaps;
import java.util.EnumMap;

 class Enum2 {

	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an EnumMap of the Size enum
		EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
		sizes.put(Size.SMALL, 28);
		sizes.put(Size.MEDIUM, 32);
		sizes.put(Size.LARGE, 36);
		sizes.put(Size.EXTRALARGE, 40);
		System.out.println("EnumMap: " +  sizes);
		
		//Using the remove() method
		sizes.replace(Size.MEDIUM, 30);
		sizes.replace(Size.LARGE, 36, 34);
		System.out.println("EnumMap using replace(): " + sizes);
		
		//Using the replaceAll() Method
		sizes.replaceAll((key, oldValue) -> oldValue + 3);
		System.out.println("EnumMap using replaceAll(): " + sizes);
		
	}
 }
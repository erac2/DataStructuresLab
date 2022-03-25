package Sets;

import java.util.EnumSet;

public class Set11 {

	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating an EnumSet using allOf()
		EnumSet<Size> sizes = EnumSet.noneOf(Size.class);
		
		System.out.println("EnumSet: " + sizes);
	}

}
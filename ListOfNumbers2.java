package Day6;

public class ListOfNumbers2 {
public int [] arr = new int[10];

public void writeList() {
	
	try {
		arr[10] = 11;
	}
	
	catch (NumberFormatException e1) {
		System.out.println("NumberFormatException => " + e1.getMessage());
	}
	
	catch (IndexOutOfBoundsException e2) {
		System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
	}
	
}
}

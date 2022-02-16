package Day7;
import java.util.*;
public class Maain27 {

	private void displayList(List<String>...lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Maain27 obj = new Maain27();
		
		List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu Un");
		obj.displayList(universityList);
		
		List<String> programmingLanguages = Arrays.asList("Java", "C");
		obj.displayList(universityList, programmingLanguages);
	}

}

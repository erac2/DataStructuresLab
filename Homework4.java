import java.util.Set;
import java.util.HashSet;

public class Homework4 {

	public static void main(String[] args) {
		
		//Question 1
		
		//Creating a set using the HashSet class
		Set<Integer> set1 = new HashSet<>();
		
		//Add elements to the set1
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(0);
		set1.add(6);
		set1.add(5);
		
		int m = set1.size();

		//Creating another set using the HashSet class
		Set<Integer> set2 = new HashSet<>();
		
		//Add elements
		set2.add(1);
		set2.add(2);
		set2.add(3);
		int n = set2.size();
				
		//Union of two sets
		set1.addAll(set2);
		set1.remove(0);
		System.out.println("Set 1: " + set1 + " M: " + m);        
		System.out.println("Set 2 : " + set2 + " N: " + n);
		System.out.println("Merged Sets are: " + set1 + " and " + set2);  
	                     
		System.out.println("Output: " + set1);
		
		
		//Question 2
		
		System.out.println();
		
		int [] list = {1, 2, 2, 3, 4, 5, 6};
		
		int nextOne;
		int b = 0;
		
		while(b <= list.length) {			
			System.out.println("hi");

			if(b == list[b] && b == list[b+1]) {
				nextOne = b;
				System.out.println(b + nextOne);
			}
			b++;
		}
		
		/**for(int b = 0; b <= list.length; b++) {
			if(b == list[b] && b == list[b+1]) {
				nextOne = b;
				System.out.println(b + nextOne);
			}
		}*/

	}
}
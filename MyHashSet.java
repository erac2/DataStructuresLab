import java.util.HashSet;
import java.util.*;

public class MyHashSet {

	HashSet<Integer> Keys = new HashSet();
	
	public MyHashSet() {
		
	}
	
	public void add(int key) {
		Keys.add(key);
	}
	
	boolean contains(int key) {
		if (Keys.contains(key)){
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}
		
	}
	
	public void remove(int key) {
		if(Keys.contains(key)) {
		Keys.remove(key);
		}
	}
	
	
	public static void main(String[]args) {
		
		MyHashSet keys = new MyHashSet();
		keys.add(1);
		keys.add(2);
		keys.contains(1);
		keys.contains(3);
		keys.add(2);
		keys.contains(2);
		keys.remove(2);
		keys.contains(2);
		
	}
}
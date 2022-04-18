import java.util.HashSet;
import java.util.*;

public class MyHashSet {

	HashSet<Integer> Keys = new HashSet<Integer>();
	
	public MyHashSet() {
		
	}
	
	Keys key;
	
	public void add(key) {
		Keys.add(key);
	}
	
	boolean contains(key) {
		if (Keys.contains(key)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void remove(key) {
		if(Keys.contains(key)) {
		Keys.remove(key);
		}
	}
}

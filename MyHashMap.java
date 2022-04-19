import java.util.HashMap;

public class MyHashMap {



	public MyHashMap() {

	}
	
	HashMap<Integer, Integer> map = new HashMap<>();

	public void put(int key, int value) {	
		map.put(key, value);
		System.out.println("null");
	}

	int get(int key) {
		 if(map.get(key) == null) {
			 System.out.println(-1);
			 return -1;
		 }
		 else{
			 System.out.println(map.get(key)); 
		 }
		return key;
		 }

	void remove(int key) {
		map.remove(key);
	}
	
	public static void main(String[]args) {
		
		MyHashMap myHashMap = new MyHashMap();
		
		myHashMap.put(0, 0);
		myHashMap.put(1, 1);
		myHashMap.put(2, 2);
		myHashMap.get(1);
		myHashMap.get(3);
		myHashMap.put(2, 1);
		myHashMap.get(2);
		myHashMap.remove(2);
		myHashMap.get(2);
		
	}
}

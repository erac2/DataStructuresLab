package TreeMaps;

public class BinarySearch6 {

	int binarySearch(int array[], int x, int low, int high) {
		
		//Repect ubtul the pinters low and high met each other
		while(low<=high){
			int mid = low (high-low)/2;
			
			if(array[mid]==x)
				return mid;
			if(array[mid]<x)
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}
	
	public static void main (String[]args) {
		BinarySearch ob = BinarySearch();
		int array
	}
}

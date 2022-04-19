import java.util.ArrayList;
import java.util.*;

public class Ascend {
	
	public static void main(String [] args) {
	Integer [] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
	Integer [] arr2 = {2, 1, 4, 3, 9, 6};
	
	Arrays.sort(arr1.);
	
	int temp;
	
	arr2.sort;
	
		for(int i = 0; i<arr1.length; i++) {
			for(int h = 0; h<arr2.length; h++) {
				if(arr1[i] == arr2[h]) {
					temp = arr1[i];
					System.out.print(temp + ", ");
					for(int p = i+1; p<arr1.length; p++) {
						if(arr1[p]==arr1[i]) {
							temp = arr1[p];
							System.out.print(temp + ", ");
						}
					}
				}
			}
		}
	}
	
}

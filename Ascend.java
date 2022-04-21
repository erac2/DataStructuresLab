import java.util.Arrays;
import java.util.*;

public class Ascend {

	public static void main(String [] args) {
		Integer [] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
		Integer [] arr2 = {2, 1, 4, 3, 9, 6};

		//Arrays.sort(arr1.);

		int temp;


		for(int i = 0; i<arr2.length; i++) {
			for(int h = 0; h<arr1.length; h++) {
				if(arr2[i] == arr1[h]) {
					temp = arr1[h];
					System.out.print(temp + ", ");
					
				}
			}
		}
		Arrays.sort(arr2);
		System.out.println(arr2);

	}



}

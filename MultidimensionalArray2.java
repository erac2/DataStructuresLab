package Day4;

public class MultidimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a 2d array
		int [][] a = {
				{1, -2, 3},
				{-4, -5, 6, 9},
				{7},
				};
		
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j <a[i].length; ++j) {
				System.out.println(a[i][j]);
			}
		}
	}

}
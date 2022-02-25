package Day10;

public class Factorial {

	static int factorial (int n) {
		if(n!=0) { // termination condition
			return n*factorial(n-1); //recursive call
					} 
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 4, result;
		result = factorial(number);
		System.out.println(number + " factorial = " + result);
	}

}

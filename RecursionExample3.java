package Day10;

public class RecursionExample3 {

	static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Factorial of 5 is: " + factorial(5));
	}

}

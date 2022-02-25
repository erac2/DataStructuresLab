package Day10;

public class Main41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = sum(5, 10);
		System.out.println(result);
	}

	public static int sum(int start, int end) {
		if(end > start) {
			return end + sum(start, end-1);
		}
		else {
			return end;

		}

	}

}

package Day7;

public class Main26 {

	@Deprecated
	public static void deprecatedMethod() {
		// TODO Auto-generated method stub
		System.out.println("Deprecated method");
	}
	
	@SuppressWarnings("deprecated")
	public static void main(String[] args) {
		Main26 depObj = new Main26();
		depObj.deprecatedMethod();
	}

}

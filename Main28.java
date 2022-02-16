package Day7;

@interface MyCustomAnnotation{
	String value() default "default value";
}

public class Main28 {

	@MyCustomAnnotation(value = "programiz")
	public void method1() {
		System.out.println("Test method 1");
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Main28 obj = new Main28();
		obj.method1();
	}

}

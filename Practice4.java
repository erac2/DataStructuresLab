public class Practice4 {

	public void display1() {
		System.out.println("Method without parameter");
	}
	
	public void display2(int a)
	{
		System.out.println("Method with a single paramter: " + a);
	}
	
	public static void main(String[]args)
	{
		Practice4 obj = new Practice4();
		
		//calling method with no parameter
		obj.display1();
		
		//calling method with the single parameter
		obj.display2(24);
	}
}

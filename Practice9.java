
public class Practice9 {

	private String name;
	
	//getter method
	
	public String getName()
	{
		return this.name;
	}
	
	//setter method
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice9 d = new Practice9();
		
		//access the private variable using the getter and setter
		d.setName("Programiz");
		System.out.println(d.getName());
	}

}

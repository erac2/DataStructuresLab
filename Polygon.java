package Day3;

interface Polygon {
void getArea(int length, int breadth);

}

//implement the Polgyon interface
class Rectangle implements Polygon{
	
	//implementation of abstract method
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is " + (length * breadth));
	}
}



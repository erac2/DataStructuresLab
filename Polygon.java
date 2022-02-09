package Day5;

interface Polygon {
void getArea();

//default method
default void getSides() {
	System.out.println("I can get sides of a polygon.");
}
}

//implements the interface
class Rectangle implements Polygon{
	public void getArea() {
		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The area of the rectangle is " + area);
	}
	
	//overides the getSides()
	public void getSides() {
		System.out.println("I have 4 sides.");
	}
}

//implements the interface
class Square implements Polygon{
	public void getArea() {
		int length = 5;
		int area = length * length;
		System.out.println("The area of the square is " + area);
	}
}
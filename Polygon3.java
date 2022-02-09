package Day5;

public class Polygon3 {

	public void render() {
		System.out.println("Rendering Polygon...");
	}
}

class Square1 extends Polygon3{
	
	//renders Square
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon3{
	
	//renders circle
	public void render() {
		System.out.println("Rendering Circle...");
	}
}

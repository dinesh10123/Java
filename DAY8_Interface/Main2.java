// : Interface Inheritance - Create an interface Shape with methods draw() 
// and calculateArea(). Create another interface Colorful that extends Shape 
// and adds a method fillColor(). Implement these interfaces in the class Circle.
interface Shape{
	void drow();
	double calculateArea();
}
interface Colorful extends Shape{
	void fillColor(String color);
}
class Circle implements Colorful{
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	public void drow(){
		System.out.println("Shape drow");
	}
	public double calculateArea(){
		return 3.14 * radius * radius;
	}
	public void getArea(){
		System.out.println("Area of Circle : "+calculateArea()); 
	}
	public void fillColor(String color){
		System.out.println("Color Fill"+color);
	}
}
public class Main{
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.drow();
		c.getArea();
		c.fillColor("Red");
	}
}
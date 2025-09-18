// Using this in Constructors: Create a class Rectangle with attributes length and width.
//  Implement a parameterized constructor that initializes these attributes. 
//  Use this to differentiate between class variables and constructor parameters. 
//  Include methods to calculate the area and perimeter.
class Rectangle{
	double length;
	double width;

	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	public double area(){
		return length * width;
	}

	public double peimeter(){
		return 2 * (length + width);
	}

	void display(){
		System.out.println("Length : "+length+" Width : "+width);
	}
}
public class Example7{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		Rectangle r2 = new Rectangle(4,3);
		r1.display();
		System.out.println("Area of Rectangle : "+r1.area());
		r2.display();
		System.out.println("Perimeter of Rectangle : "+r2.peimeter());
	}
}
//1. Create class Box and Box3d. Box3d is extended class of Box. The above two classes going to fulfill 
//the following requirement. Include constructor, set value of length, breadth, height. 
//Find out area and volume. 
public class Box{
	protected int length;
	protected int breadth;
	

	public Box(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public int area()
	 {
		return length * breadth;
	}
}
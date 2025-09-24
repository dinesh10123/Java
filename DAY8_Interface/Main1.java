// Create an interface Vehicle with a default method startEngine() that prints
//  "Engine started". Implement this interface in the class Car and override the startEngine() method.
interface Vehicle{
	default void startEngine(){
		System.out.println("Engine started");
	}
}
class Car implements Vehicle{
	@Override
	public void startEngine(){
		System.out.println("Cars Engine started");
	}
}
public class Main{
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.startEngine();
	}
}
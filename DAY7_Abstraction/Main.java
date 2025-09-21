// Create an abstract class Appliance with fields for brand and power consumption,
// and an abstract method void turnOn(). Create three subclasses, WashingMachine, Refrigerator, 
// and Microwave, each providing their own implementation of the turnOn method.
// Write a main method to create instances of WashingMachine, Refrigerator, and Microwave,
// and invoke the turnOn method on each instance to display brand and power consumed
abstract class Appliance{
	String brand;
	int PowerConsumption;

	public Appliance(String brand, int PowerConsumption){
		this.brand = brand;
		this.PowerConsumption = PowerConsumption;
	}
	abstract void turnOn();
}
class WashingMachine extends Appliance{
	public WashingMachine(String brand, int PowerConsumption){
		super(brand, PowerConsumption);
	}
	void turnOn(){
		System.out.println("WashingMachine "+brand+ " turn on "+PowerConsumption+"w");
	}
}
class Refrigerator extends Appliance{
	public Refrigerator(String brand, int PowerConsumption){
		super(brand, PowerConsumption);
	}
	void turnOn(){
		System.out.println("Refrigerator "+brand+ " turn on "+PowerConsumption+"w");
	}
}
class Microwave extends Appliance{
	public Microwave(String brand, int PowerConsumption){
		super(brand, PowerConsumption);
	}
	void turnOn(){
		System.out.println("Microwave "+brand+ " turn on "+PowerConsumption+"w");
	}
}public class Main{
	public static void main(String[] args) {
		Appliance a = new WashingMachine("LG",10);
		a.turnOn();
		Appliance b = new Refrigerator("Samsung",15);
		b.turnOn();
		Appliance c = new Microwave("Sony",20);
		c.turnOn();
	}
}
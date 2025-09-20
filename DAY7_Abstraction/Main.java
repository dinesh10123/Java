// Create an abstract class Animal with an abstract method void sound(). 
// Then, create three subclasses, Dog, Cat, and Cow, each implementing the 
// sound method with their respective sounds. Write a main method to create instances 
// of Dog, Cat, and Cow, and invoke the sound method on each instance.
abstract class Animal{
	abstract void sound();
}
class Dog extends Animal{
	void sound(){
		System.out.println("Dog method called");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Cat method called");
	}
}
class Cow extends Animal{
	void sound(){
		System.out.println("Cow method called");
	}
}
public class Main{
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		Animal b = new Cat();
		b.sound();
 		Animal c = new Cow();
		c.sound();
	}
}
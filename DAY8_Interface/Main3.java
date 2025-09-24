// Create an interface Animal with methods makeSound() and eat(). 
// Implement this interface in two classes Dog and Cat.
interface Animal{
	void makeSound();
	void eat();
}
class Dog implements Animal{
	public void makeSound(){
		System.out.println("Dog Sound");
	}
	public void eat(){
		System.out.println("Dog eat");
	}
}
class Cat implements Animal{
	public void makeSound(){
		System.out.println("Cat Sound");
	}
	public void eat(){
		System.out.println("Cat eat");
	}
}
public class Main{
	public static void main(String[] args) {
		Animal a = new Dog();
		a.makeSound();
		a.eat();
		Animal b = new Cat();
		b.makeSound();
		b.eat();
	}
}
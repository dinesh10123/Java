// 4. Demonstrate calling the constructor of the base class from the constructor of the derived class. 
// Create objects of person and employee classes to show the order of invocation of constructors. 

public class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		System.out.println("Person constructor called!");
		this.name = name;
		this.age = age;
	}
	public String setName(){
		return name;
	}
	public int setAge(){
		return age;
	}
	public void getData(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
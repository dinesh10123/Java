class Person {
    String name;
    int age;
    String country;
}

class Child extends Person{
	Child(){
		String name = "Unknown";
		int age = 0;
		String country = "Unknown";
	}

	Child(String name, int age, String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}

	Child(String n, int a){
		name = n;
		age = a;
		country = "India";
	}

	public void display(){
		System.out.println("Name : "+name+", Age : "+age+", Country : "+country);
	}
}
public class Example3{
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("Dinesh",22,"India");
		Child c3 = new Child("sagar",23);

		c1.display();
		c2.display();
		c3.display();
	}
}
class Person{
	 String name;
	 int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void display(){
		System.out.println("Name : "+this.name+", Age : "+this.age);
	}

	public boolean isOlderThan(Person other){
		return this.age > other.age;
	}
}
public class Example4{
	public static void main(String[] args) {
		Person p1 = new Person("Dinesh",22);
		Person p2 = new Person("sagar",23);

		p1.display();
		p2.display();

		if(p1.isOlderThan(p2))
			System.out.println(p1.name+" is older than "+p2.name);
		else
			System.out.println(p2.name+" is older than "+p1.name);
	}
}
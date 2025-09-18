class Person{
	String name; 
	int age;
	String country;

	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setCountry(String c){
		country = c;
	}


	public void getName(){
		System.out.println("Name : "+name);
	}
	public void getAge(){
		System.out.println("Age : "+age);
	}
	public void getCountry(){
		System.out.println("country : "+country);
	}
}
public class Example2{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Dinesh");
		p1.setAge(22);
		p1.setCountry("India");
		p1.getName();
		p1.getAge();
		p1.getCountry();
	}
}
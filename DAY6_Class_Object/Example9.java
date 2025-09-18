// Composition and Aggregation: Create a class Address with attributes street, city, and state. 
// Then create a class Person with attributes name and an Address object.
//  Demonstrate how to use common relationship between a person and their address
class Address{
	private String street;
	private String city;
	private String state;

	Address(String street, String city, String state){
		this.street = street;
		this.city = city;
		this.state = state;
	}

	 @Override
    public String toString() {
        return street + ", " + city + ", " + state;
    }
}
class Person{
		private String name;
		private Address address;

		Person(String name, Address address){
			this.name = name;
			this.address = address;
		}

		public void display(){
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
    	}
	}
public class Example9{
	public static void main(String[] args) {
		Address a1 = new Address("MJ Road","Jalgaon","Maharastra");
		Person p1 = new Person("Dinesh",a1);

		p1.display();
	}
	
}
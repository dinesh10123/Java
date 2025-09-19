public class Main{
	public static void main(String[] args) {
		Person p = new Person("Dinesh",22);
		Employee e = new Employee("Sagar", 23, 101, 50000);
		System.out.println("person Detail");
		p.getData();
		System.out.println("-----------------");
		System.out.println("Employee Detail");
		e.getData();
	}
}
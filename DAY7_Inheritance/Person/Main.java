public class Main{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setData("Dinesh",22);
		System.out.println("Person");
		p1.getData();

		Employee e1 = new Employee();
		e1.setData("Sagar",22,101,50000,"Software Developer");
		System.out.println("Employee");
		e1.getData();
	}
}
public class Main{
	public static void main(String[] args) {
		Employee e = new Employee("Dinesh",22,101,50000);
		Teacher t = new Teacher("Sagar",55,102,60000,"Java");
		System.out.println("Employee Detail");
		e.getDetail();
		System.out.println("------------------");
		System.out.println("Teacher Detail");
		t.getDetail();
	}
}